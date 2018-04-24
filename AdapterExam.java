import java.applet.*;
import java.awt.event.*;
/*
<applet code="AdapterExam" width=200 height=100>
</applet>
*/
public class AdapterExam extends Applet {
public void init() {
addMouseListener(new MouseAdapter() {
public void mousePressed(MouseEvent me) {
showStatus("Mouse Pressed");
}
});
}
public void paint(Graphics g)
{
	g.drawString("adapter class example",500,100);
}

}