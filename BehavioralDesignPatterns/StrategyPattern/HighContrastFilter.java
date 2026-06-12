package BehavioralDesignPatterns.StrategyPattern;

public class HighContrastFilter implements Filter{
    @Override
    public void applyFilter(String file) {
        System.out.println("Applying High Contrast Filter to "+file);
    }
}
