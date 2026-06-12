package BehavioralDesignPatterns.VisitorPattern;

public class ExtractOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Extract Heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Extract Anchor");
    }
}
