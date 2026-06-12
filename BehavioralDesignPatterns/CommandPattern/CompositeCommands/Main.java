package BehavioralDesignPatterns.CommandPattern.CompositeCommands;

public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BWCommand());
        composite.execute();
    }
}
