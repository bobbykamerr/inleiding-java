package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*

Schrijf een applet, waarin de gebruiker in een tekstvak een getal kan intikken. Op het scherm wordt bijgehouden wat het hoogste getal is dat de gebruiker tot dan toe heeft ingevoerd.
1. Tekstvak maken waar getal ingetypt kan worden
2. Tekst die ingetype eruit halen
3. Bijhoudeen wat het hoogste getal is
4. Is het ingetype getal groter dan het hoogste getal

*/
public class Test extends Applet {
    TextField tekstvak;
    Button buttonOne;
    String tekst;
    String onderstetekst;
    int grootsteGetal;
    int laagsteGetal;
    int getal;

    public void init(){
        tekstvak = new TextField("", 20);
        buttonOne = new Button("OK!");
        buttonOne.addActionListener(new ButtonListenerOne());
        tekst = "";
        onderstetekst = "";
        add(tekstvak);
        add(buttonOne);

        grootsteGetal = 0;
        laagsteGetal = 999;
    }
    public void paint(Graphics graph){
        graph.drawString(tekst,40,50);
        graph.drawString(onderstetekst,80,100);
    }


    class ButtonListenerOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            String a;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > grootsteGetal) {
                grootsteGetal = getal;
                tekst = "het grootste getal is " + grootsteGetal;
            }
            repaint();
            a = tekstvak.getText();
            getal = Integer.parseInt(a);
            if (getal < laagsteGetal) {
                laagsteGetal = getal;
                tekst = "het laagste getal is " + laagsteGetal;
            }
            repaint();
        }

    }
}