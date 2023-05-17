package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryContainer {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public LibraryIterator createIterator() {
        return new BookIterator(books);
    }
}

// Clasa de aplic