package BehavioralDesignPatterns.CommandPattern.Exercise;

public interface UndoableCommand extends Command{
    void unexecute();
}
