package BehavioralDesignPatterns.ObserverPattern;

public class SpreadSheet implements Observer{
    DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void doNotify() {
        System.out.println("SpreadSheet updated : "+dataSource.getData());
    }
}
