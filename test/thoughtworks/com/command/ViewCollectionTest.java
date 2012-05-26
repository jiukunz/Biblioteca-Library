package thoughtworks.com.command;

import org.junit.Test;
import thoughtworks.com.Command;
import thoughtworks.com.Customer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ViewCollectionTest {
    @Test
    public void should_return_collection_view() throws Exception {
        String collectionView = "collection_view";
        Customer customer = createCustomerWithCollectionView(collectionView);
        Command command = new ViewCollection(customer);

        assertThat(command.execute(),is(collectionView));
    }

    private Customer createCustomerWithCollectionView(String collectionView) {
        Customer customer = mock(Customer.class);
        when(customer.viewCollection()).thenReturn(collectionView);
        return customer;
    }


}
