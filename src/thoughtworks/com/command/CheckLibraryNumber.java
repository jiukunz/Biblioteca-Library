package thoughtworks.com.command;

import thoughtworks.com.Command;

public class CheckLibraryNumber implements Command {
    @Override
    public String execute() {
        return "Please talk to Librarian. Thank you.";
    }
}

