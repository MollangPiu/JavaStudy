package campus.frame.Input;

import javax.swing.*;
import java.awt.*;

public class InputA extends JFrame {

    InputA() {
        setSize(300, 200);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));


        //text 길이
        JTextField textField = new JTextField(10);
        add(textField);


        setVisible(true);

    }
    public static void main(String[] args) {
        new InputA();
    }
}
