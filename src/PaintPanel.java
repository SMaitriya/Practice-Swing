import javax.swing.*;
import java.awt.*;

public class PaintPanel extends JPanel {
    private int x, y;

    public PaintPanel() {
        this.x = 200;
        this.y = 200;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawRect(this.x, this.y, 100, 50);  // Dessine un rectangle aux coordonnées actuelles
    }

    // Met à jour les coordonnées du rectangle et redessine le panel
    public void setRectCoords(int x, int y) {
        this.x = x;
        this.y = y;
        repaint(); // Redessine le panneau avec le rectangle à la nouvelle position
    }
}
