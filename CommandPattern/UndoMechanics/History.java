package CommandPattern.UndoMechanics;

import java.util.Deque;
import java.util.ArrayDeque;

public class History {
    private Deque<String> history = new ArrayDeque<>();
    private String previous;

    public void push(String content) {
        history.add(content);
    }

    public String pop() {
        return history.removeLast();
    }
}
