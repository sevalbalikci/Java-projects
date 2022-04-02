package Lists;
import java.util.*;

public class queue {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> q = new PriorityQueue<String>();
        
        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        // peek: returns element with the highest priority
        System.out.printf("%s ", q.peek());

        // poll: removes element with the highest priority
        q.poll();
        System.out.printf("%s ", q);

    }
}
