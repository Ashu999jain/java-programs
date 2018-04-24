import java.awt.*;
import java.applet.*;
/*
<applet code = "Banner" width = 400 height = 100>
</applet>
*/
public class Banner extends Applet implements Runnable
 {
	 Thread t;
	 boolean pause = false;
 String msg = " this is my java world";
	 public void init()
	
	 {   
		 setForeground(Color.blue);
		 setBackground(Color.yellow);
	 }
	 public void start()
	 {
		 t = new Thread(this);
		 t.start();
		/* */
		 }
	 public void run()
	 {
		 for( ; ; ) {
try {
repaint();
Thread.sleep(250);
if(pause)
break;
} catch(InterruptedException e) {}
}
		 }
	 
	 public void paint(Graphics g)
	 {char ch;
ch = msg.charAt(0);
msg = msg.substring(1, msg.length());
msg += ch;
g.drawString(msg, 50, 30);
	 }
 }
 