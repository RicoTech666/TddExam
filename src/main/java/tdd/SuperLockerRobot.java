package tdd;

import java.util.List;

public class SuperLockerRobot extends AbstractLockerRobot{

    SuperLockerRobot (List<Locker> lockerList) {
        super(lockerList);
    }

    @Override
    Ticket store(Bag customerBag) {
        if(lockerList.size()>0) {
            return lockerList.get(0).store(customerBag);
        }
        return null;
    }
}
