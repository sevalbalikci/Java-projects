package Files;
import java.io.File;
import java.util.Scanner;

public class readingMyFile {
    public static void main(String[] args) {
        Scanner sca = null;
        try {
            File x = new File("C:\\Users\\seval\\OneDrive\\Dokumente\\Seval Balikci\\TU GRAZ\\LV_Informatik1_Kurse_und_Termine.docx");
            sca = new Scanner(x);
            while (sca.hasNext()) {
                System.out.println(sca.next());
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            sca.close();
        }
    }
}
