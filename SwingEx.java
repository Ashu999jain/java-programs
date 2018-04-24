import javax.swing.*;
class SwingEx 
{
public static void main(String[] args)
{
b.add(ActionListener(new H());
class H implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
tf.setText("hello world");
}

} 
 
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("D:\\Camera\\IMG-20180224-WA0056.jpg"));    
b.setBounds(100,100,100, 40); 
   
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
}
}