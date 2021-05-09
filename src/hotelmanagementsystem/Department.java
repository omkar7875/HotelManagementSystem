
package hotelmanagementsystem;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import net.proteanit.sql.DbUtils;

import java.sql.*;

public class Department extends JFrame implements ActionListener{
    
    
    JButton b1,b2;
    
    JTable t1;
    
    Department(){
 
        t1= new JTable();
        t1.setBounds(0, 50, 700, 350);
        add(t1);
        
        b1 = new JButton("Submit");
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.setBounds(180, 400, 120, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.setBounds(380, 400, 120, 30);
        b2.addActionListener(this);
        add(b2);
        
        JLabel l3 = new JLabel("Department");
        l3.setBounds(130, 10, 100, 20);
        add(l3);
        
        JLabel l4 = new JLabel("Budget");
        l4.setBounds(480, 10, 100, 20);
        add(l4);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(500, 200, 700, 480);
        setVisible(true);
    }
    

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                String str = "select * from Department";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(str);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            }catch(Exception e){System.out.println(e);}
        }else if(ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Department().setVisible(true);
    }
}

