package CommandPattern.Exercise;

public class Main {
    public static void main(String[] args) {
        var editor = new VideoEditor();
        var history = new History();
        var textCommand = new TextCommand(editor, history, "Text Label");
        var contrastCommand = new ContrastCommand(editor, history, 2.3f);
        System.out.println(editor);
        textCommand.execute();
        contrastCommand.execute();
        System.out.println(editor);
        textCommand.unexecute();
        System.out.println(editor);
        contrastCommand.unexecute();
        System.out.println(editor);
    }
}
