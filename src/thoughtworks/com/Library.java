package thoughtworks.com;

import org.apache.commons.lang3.StringUtils;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private static final String GREETING = "Welcome to the Bangalore thoughtworks.com.Library.";
    private Map<String, String> books;

    public Library() {
        books = new HashMap<String, String>();
    }

    public Library(Map<String, String> books) {
        this.books = books;
    }

    public String greet() {
        return GREETING;
    }

    public String getBookListing() {
        return createBookListing(books);
    }

    public String findBookBy(String index) {
        return books.get(index);
    }

    private String createBookListing(Map<String,String> books) {
        return StringUtils.join(books.entrySet(), "\n").replace("=",":");
    }
}
