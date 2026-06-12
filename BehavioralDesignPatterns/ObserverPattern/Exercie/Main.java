package BehavioralDesignPatterns.ObserverPattern.Exercie;

public class Main {
    public static void main(String[] args) {
        var stockA = new Stock("A",2.3f);
        var stockB = new Stock("B",3.3f);
        var stockC = new Stock("C",4.3f);

        var listView = new StockListView();
        var statusBar = new StatusBar();

        listView.addStock(stockA);
        listView.addStock(stockB);
        listView.addStock(stockC);

        statusBar.addStock(stockA);
        statusBar.addStock(stockB);
        statusBar.addStock(stockC);

        listView.show();
        System.out.println();
        statusBar.show();
        System.out.println();

        stockA.setPrice(20.33f);

        System.out.println();
        listView.show();
        System.out.println();
        statusBar.show();
    }
}
