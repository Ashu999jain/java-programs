import java.awt.event.*;
import javax.swing.*;
 class classwork implements ActionListner
{
    JTextField t1,t2,t3;
    classwork()
    {
        JFrame f=new JFrame("calculator");
        JLabel l1=new JLabel("enter first no.");
        JLabel l2=new JLabel("enter second no.");
         JLabel l3=new JLabel(" result:-");
         t1=new JTextField();
    t2=new JTextField();
    t3=new JTextField();
    JButton b=new JButton("aans");
   b.addActionListener((ActionListener) this);
   f.add(l1);
   f.add(l2);
   f.add(l3);
   f.add(t1);
   f.add(t2);
   f.add(t3);
   b.setBounds(200,200,100,30);
   t1.setBounds(200,50,100,30);
   t2.setBounds(200,100,100,30);
   t3.setBounds(200,150,100,30);
   l1.setBounds(100,50,100,30);
   l2.setBounds(100,100,100,30);
   l3.setBounds(100,150,100,30);
   
   f.setVisible(true);
   f.setSize(500,500);
   f.setLayout(null);
    
    } 
   public void actionperformed(ActionEvent e)
   {
     int a=Integer.parseInt(t1.getText());
     int b=Integer.parseInt(t2.getText());
     int c=a+b;
     t3.setText(String.valueOf(c));
   }

   public static void main(String ar[])
   {
      classwork c= new classwork();
   }
   
    }
    
    

