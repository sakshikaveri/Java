class Task1 extends Thread {
    public void run() {
        for (int i = 0; i <= 80; i++) {
            System.out.println("First thread running!");

        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 0; i <= 80; i++) {
            System.out.println("Second thread running!");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class threadsInJava {
    public static void main(String[] args) {
        Task1 obj = new Task1();
        Task2 obj2 = new Task2();

        // obj.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(10);
        obj.start();
        obj2.start();
    }
}
