package h05;

import com.sun.org.apache.xerces.internal.impl.xs.identity.UniqueOrKey;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int valerie;
    int jeroen;
    int hans;


    public void init() {
        valerie = 40*2;
        jeroen = 100*2;
        hans = 80*2;

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

