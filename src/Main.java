import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("“Example”");
        window.setSize(500, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        JLabel mainLabel = new JLabel("Welcome : ");
        JLabel outputLabel = new JLabel("output");
        JButton button1 = new JButton("I am first");
        JButton button2 = new JButton("I am second");
        ButtonAction btn = new ButtonAction(outputLabel);
        button1.addActionListener(btn);
        button2.addActionListener(btn);




        mainPanel.add(mainLabel);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainPanel.add(outputLabel);
        window.add(mainPanel);

        window.setVisible(true);
    }
}