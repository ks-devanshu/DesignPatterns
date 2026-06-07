package StrategyPattern;

public class ImageStorage {
    public void store(String file, Compressor compressor, Filter filter) {
        compressor.compress(file);
        filter.applyFilter(file);
    }
}
