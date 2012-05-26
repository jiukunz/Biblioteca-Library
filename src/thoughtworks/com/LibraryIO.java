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

    public String scanString() {
        return scanner.next();
    }

    public int scanInteger() {
//        while (!scanner.hasNextInt()) {
//            printStream.println("Enter a number,please.");
//            scanner.nextLine();
//        }
        return scanner.nextInt();
    }

    public void println(String output) {
        printStream.println(output);
    }
}
