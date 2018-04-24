import javax.swing.*;
import java.awt.event.*;
class Ev   implements ActionListener
{
	JTextField tf;
public void actionPerformed(ActionEvent e)
{
	tf.setText("this is ved");
}
Ev()
{
JFrame f = new JFrame(" action event ");
 tf = new JTextField();
JButton b = new JButton(new ImageIcon("C:\\Users\\Ashu Jain\\Desktop\\v.png"));
b.addActionListener(this);
tf.setBounds(70,200,80,80);
b.setBounds(100,400,70,50);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
f.add(b);
f.add(tf);
}
public static void main(String [] args)
{
	new  Ev();
}
}