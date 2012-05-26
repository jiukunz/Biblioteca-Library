package thoughtworks.com.command;

import thoughtworks.com.Command;
import thoughtworks.com.Customer;
import thoughtworks.com.Library;
import thoughtworks.com.LibraryIO;

public class ReserveBook implements Command {
    private LibraryIO libraryIO;
    private Library library;
    private Customer customer;

    public ReserveBook(Library library, Customer customer) {
        this.library = library;
        this.customer = customer;
        libraryIO = new LibraryIO(System.in,System.out);
    }

    @Override
    public String execute() {
        libraryIO.println("Please enter the index of book:");
        String index = libraryIO.scanString();
        String bookName = library.findBookBy(index);
        if(bookName == null){
            return "Sorry we don't have that book yet.";
        }
        customer.saveBookToCollection(bookName);
        return "Thank You! Enjoy the book.";
    }
}
