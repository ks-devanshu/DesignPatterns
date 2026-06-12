package BehavioralDesignPatterns.CommandPattern.UndoMechanics;

public class BoldCommand implements UndoableCommand {
    private HtmlDoc doc;
    private History history;

    public BoldCommand(HtmlDoc doc, History history) {
        this.doc = doc;
        this.history = history;
    }

    @Override
    public void execute() {
        history.push(doc.getContent());
        doc.makeBold();
    }

    @Override
    public void unexecute() {
        doc.setContent(history.pop());
    }
}
