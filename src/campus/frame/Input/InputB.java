package campus.frame.Input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputB extends JFrame {

    InputB() {
        setSize(300, 200);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JTextField jTextField = new JTextField(10);
        JButton jButton = new JButton("등록");

        add(jTextField);
        add(jButton);
        
        //버튼 이벤트
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //입력 내용 출력
                System.out.println(jTextField.getText());
                new Assist();

                dispose();
            }
        });



        setVisible(true);
    }


    //이벤트 출력하기
    class Assist extends JFrame {
        public Assist() {
            setSize(200, 200);
            setLocation(0, 100);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            JTextField jTextField = new JTextField("Hello");
            add(jTextField);

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new InputB();
    }
}
