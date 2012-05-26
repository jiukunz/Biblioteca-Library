package thoughtworks.com;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CustomerTest {

    public static final String BOOK_NAME = "book_name";
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
    }

    @Test
    public void should_get_greeting_when_visit_library() throws Exception {
        String welcome = "welcome";
        Library library = createLibraryWithGreeting(welcome);

        String greeting = customer.visit(library);

        assertThat(greeting,is(welcome));
    }

    @Test
    public void should_get_all_books_from_library() throws Exception {
        String bookListing = "book_listing";
        Library library = createLibraryWithBookListing(bookListing);

        assertThat(customer.viewBooksFrom(library),is(bookListing));

    }

    @Test
    public void borrow_book_from_library_by_book_index() throws Exception {
        Library library = createLibraryWithBookName(BOOK_NAME);

        assertThat(customer.reserveBook("index",library),is(BOOK_NAME));
    }

    @Test
    public void could_save_a_book_to_collection() throws Exception {
        List<String> booksCollection = customer.saveBookToCollection(BOOK_NAME);

        int firstBookIndex = 0;
        assertThat(booksCollection.get(firstBookIndex),is(BOOK_NAME));
    }

    private Library createLibraryWithBookName(String bookName) {
        Library library = mock(Library.class);
        when(library.findBookBy(any(String.class))).thenReturn(bookName);
        return  library;
    }

    private Library createLibraryWithBookListing(String bookListing) {
        Library library = mock(Library.class);
        when(library.getBookListing()).thenReturn(bookListing);
        return library;
    }

    private Library createLibraryWithGreeting(String greeting) {
        Library library = mock(Library.class);
        when(library.greet()).thenReturn(greeting);
        return library;
    }
}
