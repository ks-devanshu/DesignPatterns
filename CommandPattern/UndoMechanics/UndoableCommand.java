package CommandPattern.UndoMechanics;

public interface UndoableCommand extends Command{
    void unexecute();
}
