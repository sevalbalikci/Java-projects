package Files;
import java.io.File;

public class workingWithFiles {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\seval\\OneDrive\\Dokumente\\BenidefktFinanz.txt");
        if (f.exists()) {
            System.out.println(f.getName()+" exists!");
        } else {
            System.out.println("There is no such file!");
        }
    }  
}
