package IteratorPattern.Exercise;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
