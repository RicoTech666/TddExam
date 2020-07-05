package tdd;

public class Waiter {
    private Locker smallLocker;

    public Waiter(Locker smallLocker) {
        this.smallLocker = smallLocker;
    }

    Ticket store(Customer customer) {
        if (customer.getCustomerType().equals("regular")) {
            Bag customerBag = customer.getBag();
            if (customerBag.getSize() == 'S') {
                return smallLocker.store(customerBag);
            }
        }
        return null;
    }
}
