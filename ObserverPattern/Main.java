package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        DataSource source = new DataSource();
        Observer spreadSheet = new SpreadSheet(source); // pull style
        Observer chart = new Chart(source); // pull style
        source.addObserver(spreadSheet);
        source.addObserver(chart);
        source.setData("Data One");
        source.setData("Data Two");
    }
}
