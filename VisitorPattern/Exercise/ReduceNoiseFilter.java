package VisitorPattern.Exercise;

public class ReduceNoiseFilter implements Filters{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reduce noise on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reduce noise on fact segment");
    }
}
