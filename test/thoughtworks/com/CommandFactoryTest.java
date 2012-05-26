package thoughtworks.com;

import org.junit.Test;
import thoughtworks.com.command.*;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class CommandFactoryTest {
    @Test
    public void should_return_correct_command() throws Exception {
        Library library = createDummyLibrary();
        Customer customer = createDummyCustomer();
        CommandFactory commandFactory = new CommandFactory(customer,library);

        assertThat(commandFactory.createCommand(1),instanceOf(ViewAllBooks.class));
        assertThat(commandFactory.createCommand(2),instanceOf(ReserveBook.class));
        assertThat(commandFactory.createCommand(3),instanceOf(CheckLibraryNumber.class));
        assertThat(commandFactory.createCommand(4),instanceOf(ViewCollection.class));

        int other_number_except_1234 = 33;
        assertThat(commandFactory.createCommand(other_number_except_1234),instanceOf(ErrorSelection.class));
    }

    private Customer createDummyCustomer() {
        return mock(Customer.class);
    }

    private Library createDummyLibrary() {
        return mock(Library.class);
    }
}
