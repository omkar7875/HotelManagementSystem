
package hotelmanagementsystem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

 public class HotelManagementSystem extends JFrame implements ActionListener{
        
   HotelManagementSystem(){
       setBounds(500,300,1366,565);
        // setSize(400,400);
       //setLocation(500,300);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/ICON/first.jpg"));
        JLabel l1 = new JLabel(i1);                
        l1.setBounds(0,0,1366,565);
        add(l1);
        
        JLabel l2 = new  JLabel("Hotel Management System");
        l2.setBounds(20,430,1000,90);
        l2.setForeground(Color.red);
        l2.setFont(new Font("serif",Font.BOLD,70));
        l1.add(l2);
        
        JButton b1 = new JButton("NEXT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.BLUE);
        b1.setBounds(1150,450 ,150,30);
        b1.addActionListener(this);
        l1.add(b1);
        
           setLayout(null);
        setVisible(true);   
        
        while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
                        l2.setVisible(true); 

                try{
                    Thread.sleep(500);
                }catch(Exception e){}
            }

}
    
    public void actionPerformed(ActionEvent ae) {
        new Login().setVisible(true);    
  this.setVisible(false);
    }
    public static void main(String[] args) {
             HotelManagementSystem window =new HotelManagementSystem();
             window.setVisible(true);
    }

 }
