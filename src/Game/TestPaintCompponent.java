package Game;

import java.awt.*;
import javax.swing.*;

public class TestPaintCompponent extends JFrame {

    public TestPaintCompponent() {
        //add(new Tablero());
        add(new Panel());
    }

    public static void main(String[] args) {
        TestPaintCompponent frame = new TestPaintCompponent();
        frame.setTitle("PAINTER");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(TestPaintCompponent.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setVisible(true);

    }
}
