
import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("E:\\vinoth");
        if(file.exists())
        {
            System.err.println("folder already exist");
        }
        else
        {
            file.mkdir();
            System.out.println("folder created successfully");
        }
        
        
    }
    
}
