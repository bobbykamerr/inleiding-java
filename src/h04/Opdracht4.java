package h04;

import com.sun.org.apache.xerces.internal.impl.xs.identity.UniqueOrKey;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        g.drawLine(20,10,20,250);
        g.drawLine(20,250,250,250);
        g.fillRect(55,150,30,100);

        g.setColor(Color.MAGENTA);
        g.fillRect(105,70,30,180);

        g.setColor(Color.cyan);
        g.fillRect(160,10,30,240);

        g.setColor(Color.black);
        g.drawString("Valerie",55,260);
        g.drawString("Jeroen",105,260);
        g.drawString("Hans",160,260);




    }
}
