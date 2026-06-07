package StrategyPattern;

public class BWFilter implements Filter{
    @Override
    public void applyFilter(String file) {
        System.out.println("Applying Black & White Filter to "+file);
    }
}
