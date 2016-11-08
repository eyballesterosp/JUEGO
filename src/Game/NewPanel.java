
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

class NewPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawLine(248, 0, 248, 600);
//        g.drawLine(249, 0, 249, 600);
//        g.drawLine(250, 0, 250, 600);
//        g.drawLine(251, 0, 251, 600);
//        g.drawLine(252, 0, 252, 600);
        g.setColor(Color.red);
        g.drawOval(200, 20, 100, 100);
        //dibujando intersesiones
        g.setColor(Color.red);
        g.fillRect(235, 120, 30, 20);   //cuello
        g.fillRect(235, 250, 30, 20);   //cintura
        g.fillRect(285, 180, 30, 20);   //codoIzq
        g.fillRect(201, 210, 18, 12);   //manoIzq
        //dibujando articulaciones
        g.setColor(Color.blue);
        g.drawLine(250, 140, 250, 250); //tronco
        g.drawLine(265, 140, 300, 180); //anteBrazoIzq
        g.drawLine(285, 190, 210, 210); //brazoIzq
        //g.drawLine(265, 120, 300, 180); //anteBrazoDer
        //g.drawLine(285, 190, 210, 210); //brazoDer
        //dibujando poligonos
        g.setColor(Color.yellow);
        g.drawRect(199, 19, 102, 102);
        Polygon rect = new Polygon();
        g.drawPolygon(rect);
        
        
        
        
        g.setColor(Color.red);
        g.setColor(Color.red);
    }
}
