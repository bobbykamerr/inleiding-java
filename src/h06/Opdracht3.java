package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    int som;

    public void init() {

        som = 2147483647 + 18;

    }

    public void paint(Graphics g) {

        g.drawString("" + som,10,10);

    }

}
