import javax.swing.*;
import java.awt.event.*;
class Password implements ActionListener
{       JTextField t1;
        JPasswordField  t2;
        JLabel l1,l2,l3,l4;
Password()
{
JFrame f = new  JFrame("password field example");
JButton b = new JButton("login");
 t1 = new JTextField();
t2 = new JPasswordField();
 l1 = new JLabel("user name");
 l3 = new JLabel();
 l4 = new JLabel();
 l2 = new JLabel("password");
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
l1.setBounds(100,150,100,50);
l3.setBounds(100,400,200,50);

l2.setBounds(100,250,100,50);
t1.setBounds(200,150,100,50);
t2.setBounds(200,250,100,50);
 b.setBounds(200,350,100,50);
 f.add(t1);
 f.add(t2);
 f.add(l1);
 f.add(l3);
 b.addActionListener(this);
 f.add(l2);
 f.add(b);
 }
 public void actionPerformed(ActionEvent e)
 {
	                    String data = "Username " + t1.getText();  
                   data += ", Password: "   
                   + new String(t2.getPassword());   
                   l3.setText(data);          

 }
 
 public static void main(String[] args)
{
new Password(); 
} 
 
 }
  