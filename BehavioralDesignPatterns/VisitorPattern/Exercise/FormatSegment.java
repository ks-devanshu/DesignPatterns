package BehavioralDesignPatterns.VisitorPattern.Exercise;

public class FormatSegment extends Segment{
    @Override
    public void apply(Filters filter) {
        filter.apply(this);
    }
}
