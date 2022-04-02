package Files;
import java.io.FileWriter;
import java.util.Formatter;

public class creatingFiles2 {
    public static void main(String[] args) {
        try{
        
        FileWriter fw = new FileWriter("C:\\Users\\seval\\OneDrive\\Dokumente\\test.txt",true);
        
        Formatter f = new Formatter(fw);
        
        f.format("%s : %s","1","Tiger"); // %s means String Type
        f.format("%s : %s","2","Cat");
        
        f.close();
        
        System.out.println("File saved");
            
        }catch(Exception e){
           e.printStackTrace(); // e.printStackTrace() returns the exception to System.err rather than System.out. 
        }
    }
}

/* 
%s - for strings;
%d - for integers;
%f - for float;
*/