package BehavioralDesignPatterns.StatePattern;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw a Dashed Rectangle");
    }
    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }
}
