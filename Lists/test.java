package Lists;
import java.util.*;


public class test {
    public static void main(String[] args) {
        Character[] ray = {'s', 'e', 'v'};
        List<Character> list1 = Arrays.asList(ray);
        System.out.println("The list is: ");
        output(list1);

        // reverse List
        Collections.reverse(list1);
        System.out.println("After reverse: ");
        output(list1);

        // Character new array and List
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        //copy list
        Collections.copy(listCopy, list1);
        System.out.println("After copying: ");
        output(listCopy);

        // Filling 
        Collections.fill(list1, 'A');
        System.out.println("After filling: ");
        output(list1);
    }
    //output method
    private static void output(List<Character> list2) {
        for (Character thing : list2 ) {
            System.out.printf("%s ", thing);
        }
        System.out.println();
    }
}
