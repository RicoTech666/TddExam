package tdd;

public class Waiter {
    private Locker smallLocker;
    private PrimaryLockerRobot primaryLockerRobot;

    public Waiter(Locker smallLocker) {
        this.smallLocker = smallLocker;
    }

    public Waiter(PrimaryLockerRobot primaryLockerRobot) {
        this.primaryLockerRobot = primaryLockerRobot;
    }

    Ticket store(Customer customer) {
        if (customer.getCustomerType().equals("regular")) {
            Bag customerBag = customer.getBag();
            if (customerBag.getSize() == 'S') {
                return smallLocker.store(customerBag);
            } else if(customerBag.getSize() == 'M') {
                return primaryLockerRobot.store(customerBag);
            }
        }
        return null;
    }
}
