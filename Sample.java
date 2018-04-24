import java.awt.*;
import java.applet.*;
/*
<applet code="Sample" width=300 height=50>
</applet>
*/
public class Sample extends Applet{

public void init() {

}

public void paint(Graphics g) {
setBackground(Color.cyan);
setForeground(Color.red);

g.drawString("hello java world", 10, 30);
}
}