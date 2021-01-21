package h11;
import java.applet.*;
import java.awt.*;

public class Opdracht8 extends Applet {

    public void init() {
        setSize(550,550);
    }

    public void paint(Graphics g) {

        int teller;
        int height = 5;
        int width = 5;


        for(teller = 0; teller <= 100; teller++) {



            g.drawOval(10,10, width, height);
            height += 5;
            width += 5;

        }

    }


}
