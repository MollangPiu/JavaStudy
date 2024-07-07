package campus.frameEx01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Login");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        JButton loginButton = new JButton("Login");

        add(usernameLabel);
        add(usernameField);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //로그인 아이디 저장하기
                DataFrame.loginId = usernameField.getText();
                LoginFrame.this.setVisible(false); // 로그인 창 숨기기
                ChatFrame chatFrame = new ChatFrame(LoginFrame.this); // 채팅 창 생성 및 로그인 창 전달
                chatFrame.setVisible(true);
            }
        });


    }

}
