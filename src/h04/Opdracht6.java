package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init () {
    }
    public void paint (Graphics g) {
        g.fillRect(30,10,80,190);
        g.setColor(Color.green);
        g.fillOval(50,30,40,40);
        g.setColor(Color.orange);
        g.fillOval(50,90,40,40);
        g.setColor(Color.red);
        g.fillOval(50,150,40,40);

    }


}
