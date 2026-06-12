package BehavioralDesignPatterns.MediatorPattern;

public class Button extends UIControl{
    private boolean isEnabled;

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        notifyEventHandlers();
    }

    public boolean getEnabled() {
        return isEnabled;
    }
}
