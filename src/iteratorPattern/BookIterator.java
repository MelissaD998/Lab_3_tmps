package iteratorPattern;

import java.util.List;

public class BookIterator implements LibraryIterator{
    private List<Book> books;
    private int currentPosition;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.currentPosition = 0;
    }

    public boolean hasNext() {
        return currentPosition < books.size();
    }

    public Book next() {
        Book book = books.get(currentPosition);
        currentPosition++;
        return book;
    }
}
