package BehavioralDesignPatterns.ObserverPattern;

public class DataSource extends Subject{
    private String data;

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }

    public String getData() {
        return data;
    }
}
