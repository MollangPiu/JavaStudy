package campus.frame.component.radio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonA extends JFrame {

    public JRadioButtonA() {
        setSize(300, 300);
        setLocation(0, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JRadioButton radioButton1 = new JRadioButton("옵션 1", true);
        JRadioButton radioButton2 = new JRadioButton("옵션 2");
        JRadioButton radioButton3 = new JRadioButton("옵션 3");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        //버튼 Group
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        // 제출 버튼 생성
        JButton submitButton = new JButton("제출");

        add(submitButton);
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);
        setVisible(true);

        // 이벤트 리스너 추가
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JRadioButton button = (JRadioButton) e.getSource();
                System.out.println(button.getText() + " 선택됨");
            }
        };

        //해당 event처리가 되어어야지만, 클릭했을 때 반응이 온다.
        radioButton1.addActionListener(actionListener);
        radioButton2.addActionListener(actionListener);
        radioButton3.addActionListener(actionListener);



        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 선택된 라디오 버튼 확인
                if (radioButton1.isSelected()) {
                    System.out.println(radioButton1.getText() + " 선택됨");
                } else if (radioButton2.isSelected()) {
                    System.out.println(radioButton2.getText() + " 선택됨");
                } else if (radioButton3.isSelected()) {
                    System.out.println(radioButton3.getText() + " 선택됨");
                }
            }
        });


    }

    public static void main(String[] args) {
        new JRadioButtonA();
    }
}
