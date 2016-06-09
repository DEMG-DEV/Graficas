/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author demg
 */
public class GraficoLineal extends JPanel {

    // Datos de la Grafica de los producto A y B durante 4 Trimestres.
    int dato1, dato2, dato3, dato4, dato5, dato6, dato7, dato8, dato9;

    public void setDato1(int dato1) {
        this.dato1 = dato1;
    }

    public void setDato2(int dato2) {
        this.dato2 = dato2;
    }

    public void setDato3(int dato3) {
        this.dato3 = dato3;
    }

    public void setDato4(int dato4) {
        this.dato4 = dato4;
    }

    public void setDato5(int dato5) {
        this.dato5 = dato5;
    }

    public void setDato6(int dato6) {
        this.dato6 = dato6;
    }

    public void setDato7(int dato7) {
        this.dato7 = dato7;
    }

    public void setDato8(int dato8) {
        this.dato8 = dato8;
    }

    public void setDato9(int dato9) {
        this.dato9 = dato9;
    }

    public GraficoLineal() {

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        //Generacion del diseño de las graficas.
        ArrayList num = new ArrayList();

        //Añade el numero lateral al array
        for (int j = 7; j >= 0; j--) {
            num.add((j * dato9) / 7);
        }

        //Genera las lineas Horizontales del diseño de las graficas y
        //añade los numeros laterales a la grafica
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        for (int i = 7; i > -1; i--) {
            if (i == 0) {
                g2d.drawRect(50, 10, 410, 1);
                g2d.drawString("" + num.get(i), 10, 20);
            } else {
                g2d.drawRect(50, (i * 400) / 7, 410, 1);
                g2d.drawString("" + num.get(i), 10, (i * 400) / 7);
            }
        }

        //Añade las lineas superior e inferior
        g2d.drawRect(50, 10, 1, 410);
        g2d.drawRect(460, 10, 1, 410);

        //Genera los puntos de Referencia de los productos.
        g2d.setColor(Color.blue);
        g2d.fillRect(480, 180, 10, 10);
        g2d.drawLine(470, 185, 500, 185);
        g2d.setColor(Color.red);
        g2d.fillRect(480, 200, 10, 10);
        g2d.drawLine(470, 205, 500, 205);
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString("Producto A", 505, 190);
        g2d.drawString("Producto B", 505, 210);

        //Genera las graficas segun los datos introducidos por el usuario.
        // Trimestre 1
        g2d.setColor(Color.blue);
        g2d.fillRect(60, (400 - ((dato1 * 400) / dato9)) - 5, 10, 10);
        g2d.drawLine(60, (400 - ((dato1 * 400) / dato9)), 160, (400 - ((dato2 * 400) / dato9)));
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato1 + "%", 63, 400 - ((dato1 * dato9) / 400) - 20);

        g2d.setColor(Color.red);
        g2d.fillRect(95, (400 - ((dato5 * 400) / dato9)) - 5, 10, 10);
        g2d.drawLine(95, (400 - ((dato5 * 400) / dato9)), 195, (400 - ((dato6 * 400) / dato9)));
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato5 + "%", 98, 400 - dato5 - 20);

        g2d.drawString("Trimestre 1", 60, 420);

        // Trimestre 2
        g2d.setColor(Color.blue);
        g2d.fillRect(160, (400 - ((dato2 * 400) / dato9)) - 5, 10, 10);
        g2d.drawLine(160, (400 - ((dato2 * 400) / dato9)), 260, (400 - ((dato3 * 400) / dato9)));
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato2 + "%", 163, 400 - dato2 - 20);

        g2d.setColor(Color.red);
        g2d.fillRect(195, (400 - ((dato6 * 400) / dato9)) - 5, 10, 10);
        g2d.drawLine(195, (400 - ((dato6 * 400) / dato9)), 295, (400 - ((dato7 * 400) / dato9)));
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato6 + "%", 198, 400 - dato6 - 20);

        g2d.drawString("Trimestre 2", 160, 420);

        // Trimestre 3
        g2d.setColor(Color.blue);
        g2d.fillRect(260, (400 - ((dato3 * 400) / dato9)) - 5, 10, 10);
        g2d.drawLine(260, (400 - ((dato3 * 400) / dato9)), 360, (400 - ((dato4 * 400) / dato9)));
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato3 + "%", 263, 400 - dato3 - 20);

        g2d.setColor(Color.red);
        g2d.fillRect(295, (400 - ((dato7 * 400) / dato9)) - 5, 10, 10);
        g2d.drawLine(295, (400 - ((dato7 * 400) / dato9)), 395, (400 - ((dato8 * 400) / dato9)));
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato7 + "%", 298, 400 - dato7 - 20);

        g2d.drawString("Trimestre 3", 260, 420);

        // Trimestre 4
        g2d.setColor(Color.blue);
        g2d.fillRect(360, (400 - ((dato4 * 400) / dato9)) - 5, 10, 10);
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato4 + "%", 363, 400 - dato4 - 20);

        g2d.setColor(Color.red);
        g2d.fillRect(395, (400 - ((dato8 * 400) / dato9)) - 5, 10, 10);
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 12));
        g2d.drawString(dato8 + "%", 398, 400 - dato8 - 20);

        g2d.drawString("Trimestre 4", 360, 420);
    }
}
