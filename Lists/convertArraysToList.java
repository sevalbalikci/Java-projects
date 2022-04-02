package Lists;
import java.util.*;

public class convertArraysToList {
    public static void main(String[] args) {
        String[] s1 = {"baby", "human", "person", "people"};
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(s1));

        theList.add("pumpkin");
        theList.addFirst("First");

        // convert back to an array
        s1 = theList.toArray(new String[theList.size()]);

        for (String x : s1) {
            System.out.printf("%s ", x);
        }
    }
}
