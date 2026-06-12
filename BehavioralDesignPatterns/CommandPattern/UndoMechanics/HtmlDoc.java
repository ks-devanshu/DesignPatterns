package BehavioralDesignPatterns.CommandPattern.UndoMechanics;

public class HtmlDoc {
    private String content;

    public void makeBold() {
        this.content = "<b>"+content+"</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
