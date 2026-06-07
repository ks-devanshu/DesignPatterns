package CommandPattern.Exercise;

import java.util.Deque;
import java.util.ArrayDeque;

public class History {
    private Deque<UndoableCommand> history = new ArrayDeque<>();

    public void push(UndoableCommand current) {
        history.add(current);
    }

    public UndoableCommand pop() {
        return history.removeLast();
    }
}
