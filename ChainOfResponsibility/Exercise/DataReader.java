package ChainOfResponsibility.Exercise;

public class DataReader {
    private Handler handler;

    public DataReader(Handler handler) {
        this.handler = handler;
    }

    public void read(String fileName) {
        handler.handle(fileName);
    }
}
