import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("test");
        window.setSize(300,150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(new JLabel("hello"));
        window.add(new JLabel("World"));

        window.setVisible(true);
    }
}