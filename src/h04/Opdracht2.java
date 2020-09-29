package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.drawRect(50, 120, 190, 100);
        g.drawLine(50, 120, 150, 50);
        g.drawLine(150,50,240, 120);
        g.drawLine(50, 120, 240, 120);
    }
}
