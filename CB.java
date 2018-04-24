import javax.swing.*;  
import java.awt.event.*;    
public class CB implements ItemListener    
{     final JLabel l;
JCheckBox c1;
JCheckBox c2;
     CB(){    
        JFrame f= new JFrame("CheckBox Example");    
       l = new JLabel();            
        l.setHorizontalAlignment(JLabel.CENTER);    
        l.setSize(400,100);    
       c1  = new JCheckBox("C++");    
        c1.setBounds(150,100, 50,50);    
       c2  = new JCheckBox("Java");    
        c2.setBounds(150,150, 50,50);    
        f.add(c1); f.add(c2); f.add(l);    
        
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);
c1.addItemListener(this);
c2.addItemListener(this);		
     }    
	 public void itemStateChanged(ItemEvent e)
	 {
		 if (e.getSource()==c2)
		 {
			 String s = " c++ ";
			 if(e.getStateChange()==1)
			 s= s+ "checked";
		 else
			 s=s+"unchecked";
		  
		  l.setText(s);
		 }
		   else if (e.getSource()==c1)
		 {
			 String s = " java ";
			 if(e.getStateChange()==1)
			 s= s+ "checked";
		 else
			 s=s+"unchecked";
		  
		  l.setText(s);
		 }
	 }
		 
	 
	 
public static void main(String args[])    
{    
    new CB();    
}    
}    