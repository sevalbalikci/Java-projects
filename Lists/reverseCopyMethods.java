package Lists;
import java.util.*;

public class reverseCopyMethods {
    public static void main(String[] args) {
        
        // create an array and convert to list
        Character [] ray = {'p', 'i', 'd'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("List is: ");
        output(l);
        
        // reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);
        
        // create a new array and a new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        // copy contents of list into listcopy
        Collections.copy(listCopy, l);
        System.out.println("Copy of list: ");
        output(listCopy);

        // fill collection with stuff
        Collections.fill(l, 'X');
        System.out.println("After filling the list: ");
        output(l);
    }

    // Output method

    private static void output(List<Character> theList) {
        for(Character thing: theList) {
            System.out.printf("%s ", thing);
        }
        System.out.println();
    }
}
