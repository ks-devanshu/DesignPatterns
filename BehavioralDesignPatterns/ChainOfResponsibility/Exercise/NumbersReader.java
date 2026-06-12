package BehavioralDesignPatterns.ChainOfResponsibility.Exercise;

public class NumbersReader extends Handler{
    protected NumbersReader(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String fileName) {
        if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }
        return false;
    }
}
