package thoughtworks.com;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private List<String> booksCollection = new ArrayList<String>();
    
    public List<String> saveBookToCollection(String bookName) {
        booksCollection.add(bookName);
        return booksCollection;
    }

    public String viewCollection() {
        return createCollectionView(booksCollection);
    }

    private String createCollectionView(List<String> booksCollection) {
        return StringUtils.join(booksCollection, "\n");
    }
}
