package TemplateMethodPattern.Exercise;

public abstract class Window{
    public void close() {
        onClosing();
        System.out.println("Removing the window from the screen");
        onClosed();
    }
    protected abstract void onClosing();
    protected abstract void onClosed();
}
