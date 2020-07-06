package tdd;

import java.util.List;

public abstract class AbstractLockerRobot {
    List<Locker> lockerList;

    AbstractLockerRobot(List<Locker> lockerList) {
        this.lockerList = lockerList;
    }

    abstract Ticket store(Bag customerBag);
}
