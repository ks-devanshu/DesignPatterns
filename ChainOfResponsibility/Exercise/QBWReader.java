package ChainOfResponsibility.Exercise;

public class QBWReader extends Handler{
    protected QBWReader(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String fileName) {
        if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
            return true;
        }
        return false;
    }
}
