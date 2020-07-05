package tdd;

public class Locker {
    private char size;
    private int capacity;
    private int usedCapacity;


    public Locker(char size, int capacity, int usedCapacity) {
        this.size = size;
        this.capacity = capacity;
        this.usedCapacity = usedCapacity;
    }

    boolean hasCapacity() {
        return capacity > usedCapacity;
    }

    Ticket store(Bag bag) {
        if (hasCapacity()) {
            return new Ticket(bag.getSize());
        }
        return null;
    }
}
