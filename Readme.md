- Given: small bag, small locker, waiter, when regular customer store small bag, then return ticket with size S
- Given: middle bag, middle locker for PrimaryLockerRobot managed by waiter, when regular customer store middle bag, then return ticket with size M
- Given: large bag, large locker for SuperLockerRobot managed by waiter, when regular customer store large bag, then return ticket with size L
- Given: large bag, two large lockers A and B(A has empty capacity left more than B), when regular customer store large bag, then store inside A amd return ticket with size L

- Given: small bag, small locker without capacity, waiter,when regular customer store small bag, then throw locker full exception
- Given: middle bag, middle locker without capacity for PrimaryLockerRobot managed by waiter, when regular customer store middle bag, then throw locker full exception
- Given: large bag, large locker for SuperLockerRobot managed by waiter, when regular customer store large bag, then throw locker full exception
- Given: large bag, two large lockers A and B(A and B both are full), when regular customer store large bag, then store inside A amd return ticket with size L

- Given: small bag, small locker, waiter, when vip customer store small bag by LockerRobotManager, then return ticket with size S
- Given: middle bag, middle locker for PrimaryLockerRobot managed by waiter, when vip customer store middle bag by LockerRobotManager, then return ticket with size M
- Given: large bag, large locker for SuperLockerRobot managed by waiter, when vip customer store large bag by LockerRobotManager, then return ticket with size L
- Given: large bag, two large lockers A and B(A has empty capacity left more than B), when vip customer store large bag, then store inside A amd return ticket with size L

- Given: small bag, small locker, waiter, when regular customer store small bag and then get bag with returned ticket, then return the same bag that was stored 
- Given: middle bag, middle locker for PrimaryLockerRobot managed by waiter, when regular customer store middle bag and then get bag with returned ticket, then return the same bag that was stored 
- Given: large bag, large locker for SuperLockerRobot managed by waiter, when regular customer store large bag and then get bag with returned ticket, then return the same bag that was stored
- Given: large bag, two large lockers A and B(A has empty capacity left more than B), when regular customer store large bag and get bag with returned ticket,then return the same bag that was stored 
- Given: small bag, small locker, waiter, when vip customer store small bag by LockerRobotManager and get bag with returned ticket, then return the same bag that was stored 
- Given: middle bag, middle locker for PrimaryLockerRobot managed by waiter, when vip customer store middle bag by LockerRobotManager and get bag with returned ticket, then return the same bag that was stored 
- Given: large bag, large locker for SuperLockerRobot managed by waiter, when vip customer store large bag by LockerRobotManager and get bag with returned ticket, then return the same bag that was stored 
