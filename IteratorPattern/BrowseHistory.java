package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory<T> {
    private List<T> urls = new ArrayList<>();

    public void push(T url) {
        urls.add(url);
    }

    public T pop() {
        return urls.removeLast();
    }

    public Iterator createIterator() {
        return new ListIterator<T>(this);
    }

    private class ListIterator<T> implements Iterator<T>{
        private BrowseHistory<T> history;
        private int index;

        public ListIterator(BrowseHistory<T> history) {
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }
        @Override
        public T current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
