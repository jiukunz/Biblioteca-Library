package thoughtworks.com.command;

import org.junit.Test;
import thoughtworks.com.Command;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ErrorSelectionTest {
    @Test
    public void should_return_error_message() throws Exception {
        Command command = new ErrorSelection();

        assertThat(command.execute(), is("Select a valid option!!"));
    }
}
