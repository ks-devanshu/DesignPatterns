package BehavioralDesignPatterns.TemplateMethodPattern.Exercise;

public class Application extends Window {
    @Override
    protected void onClosing() {
        System.out.println("Before closing.");
    }

    @Override
    protected void onClosed() {
        System.out.println("After closing");
    }
}
