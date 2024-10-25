import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("test");
        window.setSize(300,150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();

        mainPanel.add(new JLabel("Welcome :"));
        mainPanel.add(new JButton("I am First"));
        mainPanel.add(new JButton("I am Second"));
        mainPanel.add(new JLabel("OutPut"));

        JButton b = new JButton("click me");

        b.addActionListener(new ButtonAction());
        mainPanel.add(b);

        window.add(mainPanel);

        window.setVisible(true);
    }
}