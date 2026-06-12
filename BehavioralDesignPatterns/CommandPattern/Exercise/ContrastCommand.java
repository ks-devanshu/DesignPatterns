package BehavioralDesignPatterns.CommandPattern.Exercise;

public class ContrastCommand extends AbstractUndoableCommand{
    private float contrast;
    private float previousContrast;

    public ContrastCommand(VideoEditor editor, History history, float contrast) {
        super(editor, history);
        previousContrast = editor.getContrast();
        this.contrast = contrast;
    }

    @Override
    public void doExecute() {
        editor.setContrast(contrast);
    }

    @Override
    public void unexecute() {
        editor.setContrast(previousContrast);
    }
}
