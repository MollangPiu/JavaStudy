package campus.frame.component.check;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxA extends JFrame {

    JCheckBoxA() {

        setSize(400, 300);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 체크박스 생성
        JCheckBox checkBox1 = new JCheckBox("옵션 1");
        JCheckBox checkBox2 = new JCheckBox("옵션 2");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(checkBox1);
        add(checkBox2);
        JButton jButton = new JButton("추가");
        add(jButton);

        setVisible(true);


        // Item Check 했을 때 반응.
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("옵션 1: " + (e.getStateChange() == ItemEvent.SELECTED ? "선택됨" : "선택 해제됨"));
                
                //1: 선택, 2: 선택 해제
                System.out.println(e.getStateChange());
                System.out.println(ItemEvent.SELECTED);

            }
        });

        //CheckBox 선택항목 Text 불러오기
        //클릭 된 항복 불러오기
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox1.isSelected()) {
                    System.out.println(checkBox1.getText() + " 선택됨");
                }
                if (checkBox2.isSelected()) {
                    System.out.println(checkBox2.getText() + " 선택됨");
                }
            }
        });
    }

    public static void main(String[] args) {
        new JCheckBoxA();
    }
}
