package tdd;


import org.junit.Assert;
import org.junit.Test;

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
}
