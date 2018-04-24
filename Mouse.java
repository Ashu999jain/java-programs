import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Mouse" width=300 height=100>
</applet>
*/
 public class Mouse extends Applet implements MouseMotionListener
 {
 String s  = "hello";
 int mouseY=0;
 int mouseX=0;
 
 public void init()
 {
 addMouseMotionListener(this);
 
 }
 public void mouseDragged(MouseEvent e)
 {
 s = " mouse dragged  ";
 mouseY = 50;
 repaint();
 }
 public void mouseMoved(MouseEvent me) {

showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
}

public void paint(Graphics g) {
g.drawString(s, mouseX, mouseY);
}
}