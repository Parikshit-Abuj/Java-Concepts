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
