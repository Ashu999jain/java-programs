import java.awt.*;
import java.applet.*;
/*
<applet code="AppsetColor" width=300 height=50>
</applet>
*/
class AppsetColor extends Applet
{
public void init()
{
	setBackground(Color.cyan);
setForeground(Color.red);


}
public void paint(Graphics g)
{
g.drawString("hello java world",100,100);
}

}
