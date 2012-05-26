package thoughtworks.com;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {

    public static final String BOOK_NAME = "book_name";
    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
    }

    @Test
    public void could_save_a_book_to_collection() throws Exception {
        List<String> booksCollection = customer.saveBookToCollection(BOOK_NAME);

        int firstBookIndex = 0;
        assertThat(booksCollection.get(firstBookIndex),is(BOOK_NAME));
    }

    @Test
    public void should_get_collection_view() throws Exception {
        customer.saveBookToCollection("book_name1");
        customer.saveBookToCollection("book_name2");
        customer.saveBookToCollection("book_name3");
        
        assertThat(customer.viewCollection(),is("book_name1\nbook_name2\nbook_name3"));
    }
}
