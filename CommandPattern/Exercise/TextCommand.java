package CommandPattern.Exercise;

public class TextCommand extends AbstractUndoableCommand{
    private String text;

    public TextCommand(VideoEditor editor, History history, String text) {
        super(editor, history);
        this.text = text;
    }

    @Override
    public void doExecute() {
        editor.setText(text);
    }

    @Override
    public void unexecute() {
        editor.removeText();
    }
}
