import javax.swing.*;
import java.awt.event.*;
class Billing //implements ItemListener, ActionListener
{
JCheckBox c1,c2,c3;
JLabel l1,l2;
Billing()
{
JFrame f = new JFrame();
f.setSize(500,700);
JButton b = new JButton();
l1= new JLabel(" Food Odering System "); 
c1 = new JCheckBox(" pizza @ 100 ");
c2 = new JCheckBox(" burger @ 30 ");
c3 = new JCheckBox(" tea @ 10 ");
c1.setBounds(100,150,100,50);
c2.setBounds(100,250,100,50);
c3.setBounds(100,350,100,50);
b.setBounds(100,450,100,50);
l1.setBounds(50,50,150,50);
l2.setBounds(50,550,150,50);
f.setVisible(true);
f.setLayout(null);
f.add(c1);
f.add(c2);
f.add(c3);
f.add(l1);
f.add(l2);
f.add(b);
}
public static void main(String[] args)
{
new Billing();
}
}