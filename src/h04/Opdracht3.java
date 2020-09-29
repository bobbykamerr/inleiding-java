package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init()  {
    }
    public void paint(Graphics g) {
        g.drawRect(30, 120,20,300);
        g.setColor(Color.red);
        g.fillRect(50,120,200,30);
        g.setColor(Color.white);
        g.fillRect(50,150,200,30);
        g.setColor(Color.blue);
        g.fillRect(50,180,200,30);

    }
}
