import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) {
        GUI();

    }

    public static void GUI() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(395, 550);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel textPanel = new JPanel(new GridLayout());
        textPanel.setBackground(Color.red);
        textPanel.setBounds(0, 0, 385, 75);

        JPanel buttonPanel = new JPanel(new GridLayout(6,4));
        buttonPanel.setBackground(Color.GREEN);
        buttonPanel.setBounds(0, 75, 385, 525);

        JLabel textOutPut = new JLabel("hello");
        textOutPut.setBounds(0,0,385,70);

        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton("Button " + i);
            buttonPanel.add(button);
        }

        frame.add(textPanel);
        frame.add(buttonPanel);

        frame.add(textOutPut);

        frame.setVisible(true);

    }
}