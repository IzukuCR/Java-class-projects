package Personas;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Highligther extends MouseAdapter implements MouseListener {
    private Color color;
    private Color original;

    public Highligther(Color color) {this.color = color;}

    public void mouseEntered(MouseEvent e) {
        Component source=(Component) e.getSource();
        original=source.getBackground();
        source.setBackground(color);
    }
    public void mouseExited(MouseEvent e) {
        Component source=(Component) e.getSource();
        source.setBackground(original);
    }
}
