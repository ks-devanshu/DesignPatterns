package IteratorPattern;

public interface Iterator<T> {
    T current();
    boolean hasNext();
    void next();
}
