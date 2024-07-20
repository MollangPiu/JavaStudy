package campus.frame.layoutStart;

import javax.swing.*;
import java.awt.*;

public class LayoutB extends JFrame {

    LayoutB() {
        setSize(800, 500);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton btn = new JButton("버튼2");
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutB();
    }
}
