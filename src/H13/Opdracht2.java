package H13;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void paint(Graphics g) {
        baksteenMuur(g, 10, 10, 100, 50);


    }

    public void baksteenMuur(Graphics g, int x, int y, int width, int height) {
        int teller;
        int teller2;
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
        g.setColor(Color.black);
        g.drawRect(x,y,width,height);

        for (teller = 0; teller < 10; teller++) {
            for (teller2 = 0; teller2 < 10; teller2++) {
                g.setColor(Color.red);
                g.fillRect(x,y,width,height);
                g.setColor(Color.black);
                g.drawRect(x,y,width,height);
                x += 100;


            }
            x = 10;
            y += 50; /*
            g.setColor(Color.red);
            g.fillRect(x,y,width,height);
            g.setColor(Color.black);
            g.drawRect(x,y,width,height); */


        }




    }
}