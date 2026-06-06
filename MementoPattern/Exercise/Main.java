package MementoPattern.Exercise;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        History history = new History();

        doc.setContent("First");
        doc.setFontName("Arial");
        doc.setFontSize(12);
        history.push(doc.createState());


        doc.setContent("Second");
        doc.setFontSize(24);
        history.push(doc.createState());

        doc.setContent("Third");
        doc.setFontName("Columb");

        System.out.println(doc);
        doc.restore(history.pop());
        doc.restore(history.pop());

        System.out.println(doc);
    }
}
