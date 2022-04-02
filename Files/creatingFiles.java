package Files;
import java.util.Formatter;

public class creatingFiles {
    public static void main(String[] args) {        
        try {
            Formatter fm = new Formatter("C:\\Users\\seval\\OneDrive\\Dokumente\\Seval Balikci\\Codes\\Java\\example.txt");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
