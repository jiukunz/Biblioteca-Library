package thoughtworks.com.command;

import thoughtworks.com.Command;
import thoughtworks.com.Customer;

public class ViewCollection implements Command {
    private Customer customer;

    public ViewCollection(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String execute() {
        return customer.viewCollection();
    }
}
