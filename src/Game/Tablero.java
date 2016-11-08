package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tablero extends JPanel implements ActionListener {
    private Timer timer;
    private int x;
    private int y;
    
    public Tablero(){
        this.x = 20;
        this.y = 20;
        timer = new Timer(100,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("'" + "Click" + "'");
        this.x += 10;
        this.y += 10;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
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

        g.setColor(Color.red);
        g.setColor(Color.red);
        g.fillOval(this.x, this.y, 50, 50);
    }

}
