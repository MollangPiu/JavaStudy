package campus.frame.component.choice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxA extends JFrame {

    public JComboBoxA() {

        setSize(500, 300);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);


        String [] comboNames = {"슈퍼맨", "배트맨", "홍길동"};
        JComboBox<String> comboBox = new JComboBox<>(comboNames);
        comboBox.addItem("둘리");
        add(comboBox);

        setVisible(true);

        //comboBox 내용 변경 시, 이벤트 동작
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //항목 선택하기
                Object selected = comboBox.getSelectedItem();
                System.out.println("선택된 항목: " + selected);
                String se = (String)selected;
                System.out.println(se);
            }
        });

    }


    public static void main(String[] args) {
        new JComboBoxA();
    }
}
