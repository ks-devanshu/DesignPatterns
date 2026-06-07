package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BrowseHistory<String> history = new BrowseHistory<>();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        var iterator = history.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
