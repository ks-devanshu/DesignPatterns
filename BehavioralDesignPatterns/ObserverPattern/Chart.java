package BehavioralDesignPatterns.ObserverPattern;

public class Chart implements Observer{
    DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void doNotify() {
        System.out.println("Chart updated : "+dataSource.getData());
    }
}
