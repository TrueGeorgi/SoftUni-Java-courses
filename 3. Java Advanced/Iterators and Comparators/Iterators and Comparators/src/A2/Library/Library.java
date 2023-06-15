package A2.Library;

import java.util.Iterator;

public class Library implements Iterable<Book> {

    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new iteratorLibrary();
    }

    private class iteratorLibrary implements Iterator<Book> {

        int currentBook = 0;

        @Override
        public boolean hasNext() {
            return currentBook < books.length;
        }

        @Override
        public Book next() {
            return books[currentBook++];
        }
    }
}
