package BehavioralDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    protected List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void removeObserver(EventHandler eventHandler) {
        eventHandlers.remove(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (var handler : eventHandlers)
            handler.update();
    }
}
