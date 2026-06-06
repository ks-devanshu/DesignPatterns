package MementoPattern;

import java.util.List;
import java.util.ArrayList;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        var lastIndex = states.size()-1;
        var state = states.get(lastIndex);
        states.remove(lastIndex);
        return state;
    }
}
