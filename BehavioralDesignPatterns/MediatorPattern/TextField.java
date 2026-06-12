package BehavioralDesignPatterns.MediatorPattern;

public class TextField extends UIControl{
    private String content;

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }

    public String getContent() {
        return content;
    }
}
