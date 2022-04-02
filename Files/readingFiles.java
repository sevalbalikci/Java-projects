package Files;
import java.io.File;
import java.util.Scanner;

public class readingFiles {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            File x = new File("C:\\Users\\seval\\OneDrive\\Dokumente\\BenidefktFinanz.txt");
            sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
        } catch (Exception e) {
            System.out.println("There is an Eror");
        } finally {
            sc.close();
        }
    }
}
// The file's contents are output word by word, because the next() method returns each word separately
/* ways to read files in Java by using :

-Scanner
-FileReader
-BufferedReader

Never forget to: 

-use try/catch
-never let the catch empty! (print msg at least)
-close the file after reading/writing

*/