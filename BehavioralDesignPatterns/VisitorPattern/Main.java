package BehavioralDesignPatterns.VisitorPattern;

public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.addNode(new HeadingNode());
        document.addNode(new AnchorNode());
        document.execute(new ExtractOperation());
    }
}
