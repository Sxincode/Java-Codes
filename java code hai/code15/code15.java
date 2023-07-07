// 15. WAP to create a Swing GUI application. Take two input from user and print the difference. 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Example 
{
    Example()
    {
    JFrame jf=new JFrame("Substractor");
    jf.setLayout(null);
    jf.setBounds(100,100,300,300);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    l1=new JLabel("Substraction of two numbers");
    l2=new JLabel("First Number:");
    l3=new JLabel("Second Number:");
    l4=new JLabel();
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton();

    l1.setBounds(50,50,200,20);
    l2.setBounds(50,80,100,20);
    t1.setBounds(150,80,100,20);
    l3.setBounds(50,130,100,20);
    t2.setBounds(150,130,100,20);
    b1.setBounds(80,180,100,20);
    l4.setBounds(50,240,200,20);
    b1.addMouseListener(new MouseAdapter(){
    public void  mouseClicked(MouseEvent e)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int d=a-b;
        l4.setText("Result is:"+d);
    }
    });
    jf.add(l1);
    jf.add(l2);
    jf.add(t1);
    jf.add(l3);
    jf.add(t2);
    jf.add(b1);
    jf.add(l4);
    jf.setVisible(true);      
}
}

public class code15
{
    public static void main(String[] args)
    {
        
        new Example();
        
    }
}