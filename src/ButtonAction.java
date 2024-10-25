import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

public class ButtonAction implements ActionListener {

    private JLabel lab;

    public ButtonAction (JLabel lab) {
        this.lab = lab;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton Button = ((JButton) e.getSource());
        String text = Button.getText();
        lab.setText(text);






        }
}
