/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas.mm8bexamen;

import javax.swing.JFrame;

/**
 *
 * @author demg
 */
public class GraficaBarras extends JFrame {

    private GraficoBarras graf;

    public GraficaBarras(String dato1, String dato2, String dato3, String dato4, String dato5, String dato6, String dato7, String dato8, String dato9) {
        setTitle("Grafico de Barras");
        setSize(600, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        graf = new GraficoBarras();
        graf.setDato1(Integer.parseInt(dato1));
        graf.setDato2(Integer.parseInt(dato2));
        graf.setDato3(Integer.parseInt(dato3));
        graf.setDato4(Integer.parseInt(dato4));
        graf.setDato5(Integer.parseInt(dato5));
        graf.setDato6(Integer.parseInt(dato6));
        graf.setDato7(Integer.parseInt(dato7));
        graf.setDato8(Integer.parseInt(dato8));
        graf.setDato9(Integer.parseInt(dato9));
        graf.setBounds(10, 10, 400, 400);
        add(graf);
    }
    
    

}
