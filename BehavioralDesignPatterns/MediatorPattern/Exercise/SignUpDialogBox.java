package BehavioralDesignPatterns.MediatorPattern.Exercise;

public class SignUpDialogBox {
    TextBox userName = new TextBox();
    TextBox password = new TextBox();
    CheckBox checkBox = new CheckBox();
    Button button = new Button();

    public void simulateInteraction() {
        userName.setContent("User 1");
        password.setContent("Password");
        checkBox.setChecked(true);

        userName.setContent("");
        userName.setContent("User 2");
//        password.setContent("");
//        checkBox.setChecked(false);

        System.out.println("Button Enabled : "+button.isEnabled());
    }

    public SignUpDialogBox() {
        userName.addEventHandler(this::validateContent);
        password.addEventHandler(this::validateContent);
        checkBox.addEventHandler(this::validateContent);
    }

    private void validateContent() {
        button.setEnabled(!userName.isEmpty() && !password.isEmpty() && checkBox.isChecked());
    }
}
