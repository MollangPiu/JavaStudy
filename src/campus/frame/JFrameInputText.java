package campus.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameInputText extends JFrame {

    public JFrameInputText() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JTextField textField = new JTextField(10);

        JButton button = new JButton("전송");

        JLabel label = new JLabel("Enter");


        // 버튼 클릭 이벤트 리스너 추가
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText(); // 텍스트 필드에서 텍스트를 가져옴
                label.setText(inputText); // 레이블에 텍스트를 설정
            }
        });

        // 텍스트 필드에서 엔터 키 이벤트 처리
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText(); // 텍스트 필드에서 텍스트를 가져옴
                label.setText(inputText); // 레이블에 텍스트를 설정
            }
        });

        add(textField);
        add(button);
        add(label);

        setSize(300, 120);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {

        new JFrameInputText();
    }
}
