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

//Thread methods
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }
}

public class ThreadTest
{
    public static void main(String[] args) throws Exception
    {
        MyThread t = new MyThread("My Thread 1");

        System.out.println("ID " + t.getId());
        System.out.println("Name " + t.getName());
        System.out.println("Just we have created new object.");
        t.start();
        System.out.println("State " + t.getState());
        System.out.println("Alive " + t.isAlive());
    }
}

//Daemon + join() + yield()
class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName() + " running : " + i);

            // give chance to other thread
            Thread.yield();

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) throws Exception {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread daemonThread = new MyThread();

        // setting daemon thread
        daemonThread.setDaemon(true);

        t1.start();
        t1.join();     // main waits for t1 to finish

        t2.start();
        daemonThread.start();

        System.out.println("Main thread finished");
    }
}
