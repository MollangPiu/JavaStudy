package campus.frame.test;

import javax.swing.*;
import java.awt.*;

public class JoinA extends JFrame {
    public JoinA() {
        setTitle("회원가입 창 - Styled");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10)); // Layout 변경

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 패딩 추가

        // 레이블과 텍스트 필드 생성
        JLabel nameLabel = new JLabel("이름:");
        JTextField nameTextField = new JTextField();
        JLabel passwordLabel = new JLabel("비밀번호:");
        JPasswordField passwordField = new JPasswordField();
        JLabel emailLabel = new JLabel("이메일:");
        JTextField emailTextField = new JTextField();

        // 가입 버튼 생성
        JButton signUpButton = new JButton("가입하기");
        signUpButton.setBackground(Color.LIGHT_GRAY); // 버튼 색상 변경
        signUpButton.setFont(new Font("Serif", Font.BOLD, 16)); // 폰트 변경

        // 컴포넌트들을 패널에 추가
        formPanel.add(nameLabel);
        formPanel.add(nameTextField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        formPanel.add(emailLabel);
        formPanel.add(emailTextField);
        formPanel.add(signUpButton);

        add(formPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JoinA();
    }
}
