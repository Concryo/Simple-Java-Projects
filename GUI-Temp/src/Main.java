import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        GUI();

    }

    public static void GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("GTA 6");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel firstPanel = new JPanel();
        firstPanel.setBounds(0,0,500,100);
        firstPanel.setBackground(Color.red);

        frame.add(firstPanel);

    }

}