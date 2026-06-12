package BehavioralDesignPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage();
        storage.store("File 1", new JpegCompressor(), new BWFilter());
        storage.store("File 2", new PngCompressor(), new HighContrastFilter());
    }
}
