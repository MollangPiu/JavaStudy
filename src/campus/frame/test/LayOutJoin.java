package campus.frame.test;

import javax.swing.*;
import java.awt.*;

public class LayOutJoin extends JFrame {

    public LayOutJoin() {
        setTitle("회원가입 하기");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 15, 25));  //4행 2열 Grid.

        //생성
        JLabel nameLabel = new JLabel("이름: ");
        JTextField nameField = new JTextField();

        JLabel passwordLabel = new JLabel("비밀번호: ");
        JPasswordField passwordField = new JPasswordField();

        JLabel emailLabel = new JLabel("이메일: ");
        JTextField emailField = new JTextField();

        JButton jButton = new JButton("가입하기");


        add(nameLabel);
        add(nameField);
        add(passwordLabel);
        add(passwordField);
        add(emailLabel);
        add(emailField);

        add(jButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayOutJoin();
    }
}
