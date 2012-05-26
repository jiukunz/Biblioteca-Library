package thoughtworks.com.command;

import thoughtworks.com.Command;

public class ErrorSelection implements Command {
    @Override
    public String execute() {
        return "Select a valid option!!";
    }
}
