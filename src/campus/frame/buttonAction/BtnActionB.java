package campus.frame.buttonAction;

import campus.frame.layoutStart.LayoutB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnActionB extends JFrame {

    BtnActionB() {

        setSize(800, 500);
        setLocation(0, 100);

       // setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton jButton = new JButton("버튼22");
        add(jButton);

        setVisible(true);


        //버튼 눌렀을 때, 이벤트
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("반응 확인하기");

                new LayoutB();

                //현재 프레임 닫기
                dispose();
            }
        });
                
    }

    public static void main(String[] args) {
        new BtnActionB();
    }
}
