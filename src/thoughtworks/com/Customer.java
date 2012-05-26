package thoughtworks.com;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<String> booksCollection = new ArrayList<String>();
    
    public String visit(Library library) {
        return library.greet();
    }

    public String viewBooksFrom(Library library) {
        return library.getBookListing();
    }

    public String reserveBook(String bookIndex, Library library) {
        return library.findBookBy(bookIndex);
    }

    public List<String> saveBookToCollection(String bookName) {
        booksCollection.add(bookName);
        return booksCollection;
    }
}
