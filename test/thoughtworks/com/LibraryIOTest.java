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
        String input = libraryIO.scanString();
        
        assertThat(input,is(input));
    }

    @Test
    public void should_output_to_output_stream() throws Exception {
        OutputStream outputStream = new ByteArrayOutputStream();
        InputStream inputStream = createDummyInputStream();
        LibraryIO libraryIO = new LibraryIO(inputStream,outputStream);
        
        libraryIO.println("output");

        assertThat(outputStream.toString(),is("output\n"));
    }

    @Test
    public void should_scan_integer() throws Exception {
        InputStream inputStream = new ByteArrayInputStream("100".getBytes());
        LibraryIO libraryIO = new LibraryIO(inputStream);

        assertThat(libraryIO.scanInteger(),is(100));
    }

//    @Ignore
//    @Test
//    //TODO:how to test?
//    public void should_enter_again_if_not_integer_using_scan_int() throws Exception {
//        InputStream inputStream = new ByteArrayInputStream("a".getBytes());
//        OutputStream outputStream = new ByteArrayOutputStream();
//
//        LibraryIO libraryIO = new LibraryIO(inputStream,outputStream);
//    }

    private InputStream createDummyInputStream() {
        return mock(InputStream.class);
    }
}
