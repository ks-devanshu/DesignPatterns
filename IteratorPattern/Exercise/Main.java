package IteratorPattern.Exercise;

public class Main {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.add(new Product(1,"Product One"));
        products.add(new Product(2,"Product Two"));
        products.add(new Product(3,"Product Three"));
        products.add(new Product(4,"Product Four"));
        products.add(new Product(5,"Product Five"));

        var iterator = products.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
