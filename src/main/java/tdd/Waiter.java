package tdd;

public class Waiter {
    private Locker smallLocker;
    private PrimaryLockerRobot primaryLockerRobot;
    private SuperLockerRobot superLockerRobot;

    public Waiter(Locker smallLocker) {
        this.smallLocker = smallLocker;
    }

    public Waiter(PrimaryLockerRobot primaryLockerRobot) {
        this.primaryLockerRobot = primaryLockerRobot;
    }

    public Waiter(SuperLockerRobot superLockerRobot) {
        this.superLockerRobot = superLockerRobot;
    }

    Ticket store(Customer customer) {
        if (customer.getCustomerType().equals("regular")) {
            Bag customerBag = customer.getBag();
            if (customerBag.getSize() == 'S') {
                return smallLocker.store(customerBag);
            } else if(customerBag.getSize() == 'M') {
                return primaryLockerRobot.store(customerBag);
            } else if(customerBag.getSize() == 'L') {
                return superLockerRobot.store(customerBag);
            }
        }
        return null;
    }
}
