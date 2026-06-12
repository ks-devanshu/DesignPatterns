package BehavioralDesignPatterns.VisitorPattern.Exercise;

public class FactSegment extends Segment{
    @Override
    public void apply(Filters filter) {
        filter.apply(this);
    }
}
