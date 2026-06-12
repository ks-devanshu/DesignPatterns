package ChainOfResponsibility.Exercise;

public class XLSReader extends Handler{
    protected XLSReader(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String fileName) {
        if(fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
