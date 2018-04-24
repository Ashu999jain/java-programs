package swing1;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class Swing1 implements ActionListener
{
    JTextField t;
    Swing1()
{
    JFrame f=new JFrame();
    JButton b=new JButton("start");
    JPanel p=new JPanel();
   f.add(b);
    b.setBounds(100,100,50,50);
    p.setBounds(100,100,190, 100);
    f.add(p);
    t.setBounds(100, 50, 30, 30);
     t=new JTextField();
     f.setSize(500,500);
     f.setVisible(true);
     f.setLayout(null);
  b.addActionListener(this);
}
    
 public void ActionPerformed(ActionEvent e )
 {
     int c= Integer.parseInt(t.getText());
 }

public static void main(String[] args) 
{
    new Swing1();
 }
}
    
