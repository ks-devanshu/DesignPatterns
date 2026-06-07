package CommandPattern.CompositeCommands;

public class BWCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
