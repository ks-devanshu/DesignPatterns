package ChainOfResponsibility.Exercise;

public abstract class Handler {
    private Handler next;

    protected Handler(Handler next) {
        this.next = next;
    }

    public void handle(String fileName) {
        if (doHandle(fileName))
            return;

        if (next == null)
            throw new UnsupportedOperationException("File format not supported.");

        next.handle(fileName);
    }

    protected abstract boolean doHandle(String fileName);
}
