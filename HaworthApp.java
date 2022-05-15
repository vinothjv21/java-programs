
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class MyFrame
{
    JLabel lblDBit,lblRecName,lblRecDate;
    JTextField tfDBit,tfRecName,tfRecDate;
    JFrame frame;
    JPanel panel;
    LocalDate date;
    JButton btnSubmit,btnCancel;
    public MyFrame()
    {
        System.out.println("calling constructor");
        frame=new JFrame("Vinoth App");
        panel=new JPanel();
        
        date=LocalDate.now();
        panel.setLayout(null);
        lblDBit=new JLabel("Drill Bit");
        lblDBit.setBounds(50, 40, 100, 50);
        
        tfDBit=new JTextField(10);
        tfDBit.setBounds(200, 50, 100, 20);
        
        lblRecName=new JLabel("Recv Name");
        lblRecName.setBounds(50, 90, 100, 50);
        
        tfRecName=new JTextField(10);
        tfRecName.setBounds(200, 100, 100, 20);
        
        
        lblRecDate=new JLabel("Recv Date");
        lblRecDate.setBounds(50, 140, 100, 50);
                
        tfRecDate=new JTextField(10);
        tfRecDate.setBounds(200, 150, 100, 20);
        
        tfRecDate.setText(date.toString());
        tfRecDate.setEditable(true);
        
        btnSubmit=new JButton("save");
        btnSubmit.setBounds(50, 200, 100, 20);
        
        btnCancel=new JButton("cancel");
        btnCancel.setBounds(200, 200, 100, 20);
        
        panel.add(lblDBit);
        panel.add(tfDBit);
        
        panel.add(lblRecName);
        panel.add(tfRecName);
        
        panel.add(lblRecDate);
        panel.add(tfRecDate);
        
        panel.add(btnSubmit);
        panel.add(btnCancel);
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class HaworthApp {
    public static void main(String[] args) {
        MyFrame obj=new MyFrame();
    }
}