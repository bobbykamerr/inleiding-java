package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{

    int uitkomst;

    public void init() {

        uitkomst = 113/4;

    }

    public void paint(Graphics g) {
        g.drawString("jan krijgt: " + uitkomst + " euro",10,10);

        g.drawString("ali krijgt: " + uitkomst + " euro",10,20);

        g.drawString("jeannette krijgt: " + uitkomst + " euro",10,30);

        g.drawString("bobby krijgt: " + uitkomst + " euro",10,40);

    }
}

