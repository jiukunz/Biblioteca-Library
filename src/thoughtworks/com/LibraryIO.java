package thoughtworks.com;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LibraryIO {

    private InputStream inputStream;
    private OutputStream outputStream;
    private Scanner scanner;
    private PrintStream printStream;

    public LibraryIO(InputStream inputStream) {
        this.inputStream = inputStream;
        this.scanner = new Scanner(inputStream);
    }

    public LibraryIO(InputStream inputStream, OutputStream outputStream) {
        this(inputStream);
        this.outputStream = outputStream;
        this.printStream = new PrintStream(outputStream);
    }

    public String scan() {
        return scanner.next();
    }

    public void print(String output) {
        printStream.print(output);
    }
}
