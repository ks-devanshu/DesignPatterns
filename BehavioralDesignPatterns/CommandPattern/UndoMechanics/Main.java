package BehavioralDesignPatterns.CommandPattern.UndoMechanics;

public class Main {
    public static void main(String[] args) {
        HtmlDoc doc = new HtmlDoc();
        doc.setContent("Strategy");
        var command = new BoldCommand(doc, new History());
        command.execute();
        System.out.println(doc.getContent());
        command.unexecute();
        System.out.println(doc.getContent());
    }
}
