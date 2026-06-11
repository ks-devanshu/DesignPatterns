package MediatorPattern;

public class ArticlesDialogBox{
    private ListBox listBox = new ListBox();
    private TextField textField = new TextField();
    private Button button = new Button();

    public ArticlesDialogBox() {
        listBox.addEventHandler(() -> {
            textField.setContent(listBox.getSelection());
            button.setEnabled(true);
        });

        textField.addEventHandler(this::contentChanged);
    }

    public void simulateInteraction() {
        listBox.setSelection("Article 1");
        System.out.println(textField.getContent());
        System.out.println(button.getEnabled());

        textField.setContent("");
//        textField.setContent("Article 2");
        System.out.println(textField.getContent());
        System.out.println(button.getEnabled());
    }

    private void contentChanged() {
        var content = textField.getContent();
        var isEmpty = content == null || content.isEmpty();
        button.setEnabled(!isEmpty);
    }
}
