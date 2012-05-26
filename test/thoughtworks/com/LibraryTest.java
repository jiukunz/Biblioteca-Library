package thoughtworks.com;

import org.junit.Test;
import thoughtworks.com.Library;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    @Test
    public void should_get_greeting_when_enter_into_the_library() throws Exception {
        Library library = new Library();

        String greeting = library.greet();

        assertThat(greeting,is("Welcome to the Bangalore thoughtworks.com.Library."));
    }

    @Test
    public void user_can_get_all_books_from_library() throws Exception {
        Map<String,String> books = new HashMap<String, String>();
        books.put("index1", "Clean Code");
        books.put("index2", "Refactoring");
        Library library = new Library(books);

        String bookListing = library.getBookListing();

        assertThat(bookListing,is("index1:Clean Code\nindex2:Refactoring"));
    }

    @Test
    public void should_get_a_book_by_index() throws Exception {
        Map<String,String> books = new HashMap<String, String>();
        books.put("index1", "Clean Code");
        books.put("index2", "Refactoring");
        Library library = new Library(books);
        
        String bookName = library.findBookBy("index1");

        assertThat(bookName,is("Clean Code"));
    }
}
