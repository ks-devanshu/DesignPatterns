package BehavioralDesignPatterns.StrategyPattern;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String file) {
        System.out.println("Compressing "+file+" using PNG format");
    }
}
