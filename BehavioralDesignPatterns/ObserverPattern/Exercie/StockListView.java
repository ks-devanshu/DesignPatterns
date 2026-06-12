package BehavioralDesignPatterns.ObserverPattern.Exercie;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    @Override
    public void doNotify() {
        System.out.println("Price Changed in List View -- Refreshing");
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }
}