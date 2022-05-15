
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApp {

    public static void main(String[] args) {
        Date date=new Date();  
         System.out.println("current date and time is"+date);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("date is"+sdf.format(date));
    }
    
}
