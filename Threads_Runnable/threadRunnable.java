package Threads_Runnable;
public class threadRunnable {
   
    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();

        myThread t2 = new myThread();
        t2.start();

        myThread t3 = new myThread();
        t3.start();
    }
}

class myThread extends Thread {

    @Override
    public void run() {
        display();
    }

    synchronized static void display() {
        int x = 0;

        while (x < 10) {
            System.out.println(x);
            x++;
            try {
                Thread.sleep(1000); // Thread.sleep method pauses a Thread for a specified period of time. In this case 1 second each.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
