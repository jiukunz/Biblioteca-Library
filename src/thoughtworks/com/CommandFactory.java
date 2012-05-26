package thoughtworks.com;

import thoughtworks.com.command.*;

public class CommandFactory {
    private static final int VIEW_ALL_BOOKS = 1;
    private static final int RESERVE_BOOK = 2;
    private static final int CHECK_LIBRARY_NUMBER = 3;
    private static final int VIEW_COLLECTION = 4;

    private Customer customer;
    private Library library;

    public CommandFactory(Customer customer,Library library) {
        this.customer = customer;
        this.library = library;
    }

    public Command createCommand(int command){
        switch (command){
            case VIEW_ALL_BOOKS:
                return new ViewAllBooks(library);
            case RESERVE_BOOK:
                return new ReserveBook(library,customer);
            case CHECK_LIBRARY_NUMBER:
                return new CheckLibraryNumber();
            case VIEW_COLLECTION:
                return new ViewCollection(customer);
            default:
                return new ErrorSelection();
        }
    }
}
