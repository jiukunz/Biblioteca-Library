package thoughtworks.com;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class LibraryIOTest {
    @Test
    public void should_receive_input() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("input".getBytes());
        LibraryIO libraryIO = new LibraryIO(inputStream);
        String input = libraryIO.scan();
        
        assertThat(input,is(input));
    }

    @Test
    public void should_output_to_output_stream() throws Exception {
        OutputStream outputStream = new ByteArrayOutputStream();
        InputStream inputStream = createDummyInputStream();
        LibraryIO libraryIO = new LibraryIO(inputStream,outputStream);
        
        libraryIO.print("output");

        assertThat(outputStream.toString(),is("output"));
    }

    private InputStream createDummyInputStream() {
        return mock(InputStream.class);
    }
}
