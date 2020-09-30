package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init () {
    }
    public void paint (Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 50, 90, 45);
        g.fillArc(20,20,100,50,135,90);
        g.fillArc(20,20,100,50,180,135);
        g.fillArc(20,20,100,50,225,180);
        g.fillArc(20,20,100,50,270,225);


    }



}
