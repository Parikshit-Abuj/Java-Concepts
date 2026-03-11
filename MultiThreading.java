class MyThread extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();   // starts a new thread

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }

    }
}

//USING RUNNABLE
class MyRunnable implements Runnable {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);

        t1.start();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }

    }
}

//Thread Methods : Constructors , sleep & Interrupt
class MyThread extends Thread {

    // Constructor
    MyThread(String name) {
        super(name);   // set thread name
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " running: " + i);

                // sleep method
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        // Using Thread constructor
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // interrupt method
        t1.interrupt();
    }
}
