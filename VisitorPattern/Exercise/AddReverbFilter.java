package VisitorPattern.Exercise;

public class AddReverbFilter implements Filters{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Add reverb on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Add reverb on fact segment");
    }
}
