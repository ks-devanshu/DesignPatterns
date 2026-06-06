package MementoPattern.Exercise;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        var lastIndex = states.size()-1;
        var state = states.get(lastIndex);
        states.remove(lastIndex);
        return state;
    }
}
