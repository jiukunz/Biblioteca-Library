package thoughtworks.com.command;

import thoughtworks.com.Command;
import thoughtworks.com.Library;

public class ViewAllBooks implements Command {
    private Library library;

    public ViewAllBooks(Library library) {
        this.library = library;
    }

    @Override
    public String execute() {
        return library.getBookListing();
    }
}
