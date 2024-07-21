package campus.frame.buttonAction;

import campus.frame.layoutStart.LayoutB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnActionA extends JFrame {

    BtnActionA() {

        setSize(800, 500);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton jButton = new JButton("버튼");
        add(jButton);

        setVisible(true);


        //버튼 눌렀을 때, 이벤트
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("반응 확인하기");

                new LayoutB();

                //BTN 닫을 때 참고 사항
                //DO_NOTHING_ON_CLOSE: 닫기 버튼 눌러도 동작하지 않음
                //HIDE_ON_CLOSE: 프레임 숨기기
                //DISPOSE_ON_CLOSE: 프레임 닫고, 프레임과 관련된 지원을 헤제
                //EXIT_ON_CLOSE: 전체 프로그램 종류
            }
        });
                
    }

    public static void main(String[] args) {
        new BtnActionA();
    }
}
