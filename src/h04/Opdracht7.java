package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {
    public void init (){
    }
    public void paint (Graphics g){
        g.drawRoundRect(10,10,70,70,50,50);
        g.fillOval(25,25,15,15);
        g.fillOval(25,50,15,15);
        g.fillOval(50,25,15,15);
        g.fillOval(50,50,15,30);
    }
}
