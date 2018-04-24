import javax.swing.*;
import java.awt.event.*;
class SwingEx
{
SwingEx()
{
JFrame f = new  JFrame("password field example");
JButton b = new JButton("login");
JTextField t1 = new JTextField();
JTextField t2 = new JTextField();
JLabel l1 = new JLabel("user name");
JLabel l2 = new JLabel("password");
f.setSize(500,500);
l1.setBounds(100,150,100,50);
l2.setBounds(100,250,100,50);
t1.setBounds(200,150,100,50);
t2.setBounds(200,250,100,50);
 b.setBounds(200,350,100,50);
 f.add(t1);
 f.add(t2);
 f.add(l1);
 f.add(l2);
 f.add(b);
 f.setVisible(true);
 f.setLayout(null);
 }
 
 public static void main(String[] args)
{
new SwingsEx(); 
} 
 
 }
  