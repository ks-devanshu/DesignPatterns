package BehavioralDesignPatterns.CommandPattern.UndoMechanics;

public interface UndoableCommand extends Command{
    void unexecute();
}
