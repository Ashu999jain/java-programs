import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Keyboard" height = 100 width = 300>
</applet>
*/

public class Keyboard extends Applet
implements KeyListener
{
	String msg="";
char a = 'N';
public void init() {
addKeyListener(this);
}


public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
}


public void paint(Graphics g)
{
g.drawString(msg,200,200)	;
}
}