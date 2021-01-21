
package h12;
import java.applet.*;
import java.awt.*;

public class Opdracht1 extends Applet {

    public void paint(Graphics g) {

        int teller;
        double[] getal = new double[10];
        getal[0] = 10;
        getal[1] = 9;
        getal[2] = 8;
        getal[3] = 7;
        getal[4] = 6;
        getal[5] = 5;
        getal[6] = 4;
        getal[7] = 3;
        getal[8] = 2;
        getal[9] = 1;
        int y = 20;
        double gemiddelde = 0;

        for(teller = 0; teller < getal.length; teller++) {

            g.drawString("" + getal[teller], 10,y);
            y += 20;
            gemiddelde += getal[teller];

        }
        gemiddelde = gemiddelde / getal.length;
        g.drawString(""+gemiddelde,10,y);

    }

}
