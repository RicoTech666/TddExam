package tdd;

public class Customer {
    private String customerType;
    private Bag bag;

    public Customer(String customerType, Bag bag) {
        this.customerType = customerType;
        this.bag = bag;
    }

    String getCustomerType() {
        return customerType;
    }

    Bag getBag() {
        return bag;
    }
}
