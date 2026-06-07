package CommandPattern;

public class AddCustomer implements Command{
    private CustomerService service;

    public AddCustomer(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
