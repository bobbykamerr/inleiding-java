package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {

    TextField tekst;
    Label label;
    Button confirm;
    int resultaat;
    int resultaat2;

    public void init() {

        label = new Label("voer getallen in:");
        tekst = new TextField("",10);

        confirm = new Button("Ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(tekst);
        add(confirm);
    }

    public void paint(Graphics g) {

        g.drawString("Laagste getal: " + resultaat2,100,50);
        g.drawString("Hoogste getal:" + resultaat,100,70);

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = tekst.getText();
            int getal = Integer.parseInt(output);
            if (getal > resultaat) {
                resultaat = getal;
                repaint();
            } else {
                if (resultaat2 == 0) {
                    if (getal < resultaat) {
                        resultaat2 = getal;
                        repaint();
                    }
                } else {
                    if (getal < resultaat2) {
                        resultaat2 = getal;
                        repaint();
                    }
                }
            }
        }
    }
}
