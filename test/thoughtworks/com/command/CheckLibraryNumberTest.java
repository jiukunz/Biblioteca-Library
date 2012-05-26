package thoughtworks.com.command;

import org.junit.Test;
import thoughtworks.com.Command;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckLibraryNumberTest {
    @Test
    public void should_check_library_number() throws Exception {
        Command command = new CheckLibraryNumber();

        assertThat(command.execute(), is("Please talk to Librarian. Thank you."));
    }


}
