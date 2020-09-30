package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(20,10,20,250);
        g.drawLine(20,250,250,250);
        g.fillRect(50,150,30,100);

        g.setColor(Color.MAGENTA);
        g.fillRect(80,100,30,150);

        g.setColor(Color.cyan);
        g.fillRect(110,10,30,240);




    }
}
