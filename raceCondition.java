
class Counter {
    int count;

    public synchronized void showIncrement() {
        count++;
    }
}

public class raceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                // System.out.println("Hello");
                c.showIncrement();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 2000; i++) {
                // System.out.println("Hi");
                c.showIncrement();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // stops both threads working ,
        // sometimes it gives 3000 after executing 1000,2000 times and total it executes
        // 3000
        t1.join();
        t2.join();

        // to avoid both threads reaching out to the same common variable and messing up
        // the output better do the common method as synchronised
        System.out.println("Count value--> " + c.count);

    }
}
