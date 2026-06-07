package StrategyPattern;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String file) {
        System.out.println("Compressing "+file+" using JPEG format");
    }
}
