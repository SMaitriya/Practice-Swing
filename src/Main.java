import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Example");
        window.setSize(500, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout()); // Utilisez BorderLayout pour organiser les panneaux

        // Création de mainPanel avec les composants d'interface
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        JLabel mainLabel = new JLabel("Welcome : ");
        JLabel outputLabel = new JLabel("output");
        JButton button1 = new JButton("I am first");
        JButton button2 = new JButton("I am second");
        ButtonAction btn = new ButtonAction(outputLabel);
        button1.addActionListener(btn);
        button2.addActionListener(btn);

        // Ajout des composants à mainPanel
        mainPanel.add(mainLabel);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(outputLabel);

        // Créez une instance de PaintPanel pour afficher le rectangle
        PaintPanel newPanel = new PaintPanel();
        newPanel.addMouseListener(new MousePaint(newPanel));

        // Ajoutez mainPanel en haut (NORTH) et newPanel au centre (CENTER)
        window.add(mainPanel, BorderLayout.NORTH); // mainPanel en haut
        window.add(newPanel, BorderLayout.CENTER);  // newPanel au centre

        // Rendre la fenêtre visible
        window.setVisible(true);
    }
}
