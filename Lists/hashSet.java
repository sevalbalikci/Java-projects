package Lists;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        
        String[] arr1 = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(arr1);

        System.out.printf("%s ", list);
        System.out.println();

        // removes duplicate items
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);
    }
}
