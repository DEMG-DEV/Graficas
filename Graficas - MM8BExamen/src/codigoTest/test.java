package codigoTest;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class test extends Applet implements ActionListener {

    private static final long serialVersionUID = 1L;
    Image dobleBuffer;
    Graphics miCG;
    TextField n1Campo, n2Campo, n3Campo, n4Campo;
    Label title, n1;

    Button btnAceptar = new Button();
    FlowLayout flowLayout1 = new FlowLayout();

    @Override
    public void init() {

        title = new Label("Introduce valores entre 0 y 100");
        add(title);

        n1Campo = new TextField(1);
        add(n1Campo);

        n2Campo = new TextField(1);
        add(n2Campo);

        n3Campo = new TextField(1);
        add(n3Campo);

        n4Campo = new TextField(1);
        add(n4Campo);

        btnAceptar.setLabel("Graficar");
        btnAceptar.addActionListener(this);
        flowLayout1.setHgap(25);

        this.setLayout(flowLayout1);
        add(btnAceptar); // Inicializa el doble buffer
        dobleBuffer = createImage(700, 500);
        miCG = dobleBuffer.getGraphics();
        resize(700, 500);
    }

    public void actionPerformed(ActionEvent ev) {
        //Limpia la pantalla
        miCG.clearRect(0, 0, 700, 500);

        Trazar(n1Campo.getText(), n2Campo.getText(), n3Campo.getText(), n4Campo.getText());
        titulo();
        // Ahora muestra la imagen de golpe
        repaint();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void Trazar(String n1Campo, String n2Campo, String n3Campo, String n4Campo) {
        int cordy1, cordy2, cordy3, cordy4;

        cordy1 = Integer.parseInt(n1Campo);
        cordy2 = Integer.parseInt(n2Campo);
        cordy3 = Integer.parseInt(n3Campo);
        cordy4 = Integer.parseInt(n4Campo);
        barras(cordy1, cordy2, cordy3, cordy4);
    }

    public void paint(Graphics g) {
        // Lo se tiene que presentar la imagen del buffer
        g.drawImage(dobleBuffer, 0, 0, this);
    }

    public void barras(int y1, int y2, int y3, int y4) {

        miCG.setColor(Color.blue);
        miCG.fillRect(60, 400 - y1, 65, y1);
        miCG.setColor(Color.black);
        miCG.setFont(new Font("Arial", Font.BOLD, 12));
        miCG.drawString(y1 + "%", 63, 400 - y1 - 20);

        miCG.setColor(Color.green);
        miCG.fillRect(160, 400 - y2, 65, y2);
        miCG.setColor(Color.black);
        miCG.setFont(new Font("Arial", Font.BOLD, 12));
        miCG.drawString(y2 + "%", 163, 400 - y2 - 20);

        miCG.setColor(Color.red);
        miCG.fillRect(260, 400 - y3, 65, y3);
        miCG.setColor(Color.black);
        miCG.setFont(new Font("Arial", Font.BOLD, 12));
        miCG.drawString(y3 + "%", 263, 400 - y3 - 20);

        miCG.setColor(Color.magenta);
        miCG.fillRect(360, 400 - y4, 65, y4);
        miCG.setColor(Color.black);
        miCG.setFont(new Font("Arial", Font.BOLD, 12));
        miCG.drawString(y4 + "%", 363, 400 - y4 - 20);
    }

    public void titulo() {
        miCG.setColor(Color.red);
        miCG.setFont(new Font("Arial", Font.BOLD, 18));
        miCG.drawString("Grafica de barras", 15, 100);
    }
}
