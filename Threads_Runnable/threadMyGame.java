package Threads_Runnable;

public class threadMyGame {    
    public static void main(String[] args) {
        Drawing d = new Drawing();
        Singing s = new Singing();

        s.start();
        d.start();
    }
}
class Drawing extends Thread {
    public void run() {
        System.out.println("Drawing starts");
    }
}

class Singing extends Thread {
    public void run() {
        System.out.println("Singing starts");
    }
}