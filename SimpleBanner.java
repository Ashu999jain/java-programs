import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" width=300 height=50>
</applet>
*/
public class SimpleBanner extends Applet implements Runnable {
;
Thread t = null;
int state;
volatile boolean stopFlag;

public void init() {
setBackground(Color.cyan);
setForeground(Color.red);
}

public void start() {
t = new Thread(this);
stopFlag = false;
t.start();
}

public void run() {

for( ; ; ) {
try {
repaint();
Thread.sleep(250);
if(stopFlag)
break;
} catch(InterruptedException e) {
	System.out.println("error occurs");
}
}
}


public void paint(Graphics g) {

g.drawString( " A Simple Moving Banner.", 50, 30);
}
}