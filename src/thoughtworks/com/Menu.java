package thoughtworks.com;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private static final String MAIN_MENU =
            "1.Show all books\n" +
            "2.Reserve a book by index\n" +
            "3.Check library num\n" +
            "4.View my collection\n" +
            "0.Exit\n" +
            "Select using number:";
    public static final int EXIT_CODE = 0;
    public static LibraryIO libraryIO = new LibraryIO(System.in,System.out);

    public static void main(String[] args) {
        Library library = createDefaultLibrary();
        CommandFactory commandFactory = new CommandFactory(new Customer(),library);

        library.greet();
        int input;
        libraryIO.println(MAIN_MENU);
        while((input = getUserCommand(libraryIO)) != EXIT_CODE){
            Command command = commandFactory.createCommand(input);
            String result = command.execute();
            libraryIO.println(result);
            libraryIO.println(MAIN_MENU);
        }

        libraryIO.println("Bye Bye");
    }

    private static Library createDefaultLibrary() {
        Map<String, String> books = createDefaultBooks();
        return new Library(books);
    }

    private static int getUserCommand(LibraryIO libraryIO) {
        return libraryIO.scanInteger();
    }

    private static Map<String, String> createDefaultBooks() {
        Map<String,String> books = new HashMap<String, String>();
        books.put("index1", "Clean Code");
        books.put("index2", "Refactoring");
        return books;
    }
}
