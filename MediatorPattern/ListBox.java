package MediatorPattern;

public class ListBox extends UIControl{
    private String selection;

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }

    public String getSelection() {
        return selection;
    }
}
