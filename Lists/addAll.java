package Lists;
import java.util.*;

public class addAll {
    public static void main(String[] args) {
        
        // convert arr1 array to a list
        String[] arr1 = {"apples", "banana", "corn", "ham"};
        List<String> list1 = Arrays.asList(arr1);
        
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("dig");

        for (String x: list2) {
            System.out.printf("%s ",x);
        }

        Collections.addAll(list2, arr1);

        System.out.println();

        for (String x: list2) {
            System.out.printf("%s ",x);
        }

        System.out.println();
        
        // frequency
        System.out.println(Collections.frequency(list2, "dig"));
        
        // disjoint
        boolean tof = Collections.disjoint(list1, list2);
        System.out.println(tof);
        
        if(tof) {
            System.out.println("These lists do not have anything in common");
        } else {
            System.out.println("These list must have something in common");
        }
    }
}
