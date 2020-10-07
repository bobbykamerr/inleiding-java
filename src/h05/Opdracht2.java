package h05;

import com.sun.org.apache.xerces.internal.impl.xs.identity.UniqueOrKey;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    int valerie;
    int jeroen;
    int hans;


    public void init() {
        valerie = 140;
        jeroen = 350;
        hans = 280;
        setSize(400,400);

    }
    public void paint(Graphics g) {
        g.drawLine(50,350,350,350);
        g.drawLine(50,350,50,0);
        g.fillRect(50,350-valerie,50,valerie);
        g.setColor(Color.yellow);
        g.fillRect(100,350-jeroen,50,jeroen);
        g.setColor(Color.blue);
        g.fillRect(150,350-hans,50,hans);




    }
}

