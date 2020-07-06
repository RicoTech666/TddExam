package tdd;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WaiterTest {
    @Test
    public void should_return_S_ticket_when_regular_customer_store_S_bag_via_waiter_given_S_bag_S_locker_and_waiter() {
        Locker smallLocker = new Locker('S', 10, 1);
        Waiter waiter = new Waiter(smallLocker);
        Bag bag = new Bag('S');
        Customer regularCustomer = new Customer("regular", bag);

        Ticket ticket = waiter.store(regularCustomer);

        Assert.assertEquals('S', ticket.getBagSize());
    }
    @Test
    public void should_return_M_ticket_when_regular_customer_store_M_bag_via_waiter_given_M_bag_M_locker_and_primaryLockerRobot_and_waiter() {
        Locker middleLocker = new Locker('M',10,1);
        PrimaryLockerRobot primaryLockerRobot = new PrimaryLockerRobot(Arrays.asList(middleLocker));
        Waiter waiter = new Waiter(primaryLockerRobot);
        Bag bag = new Bag('M');
        Customer regularCustomer = new Customer("regular", bag);

        Ticket ticket = waiter.store(regularCustomer);

        Assert.assertEquals('M', ticket.getBagSize());
    }
    @Test
    public void should_return_L_ticket_when_regular_customer_store_L_bag_via_waiter_given_L_bag_L_locker_and_superLockerRobot_and_waiter() {
        Locker largeLocker = new Locker('L',10,1);
        SuperLockerRobot superLockerRobot = new SuperLockerRobot(Arrays.asList(largeLocker));
        Waiter waiter = new Waiter(superLockerRobot);
        Bag bag = new Bag('L');
        Customer regularCustomer = new Customer("regular", bag);

        Ticket ticket = waiter.store(regularCustomer);

        Assert.assertEquals('L', ticket.getBagSize());
    }
}
