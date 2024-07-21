package campus.frame.component.choice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceA extends JFrame {

    ChoiceA() {

        setSize(300, 300);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);


        // 한글 폰트 설정 (IDE에 설치 되어 있을 경우에만 적용)
        Font koreanFont = new Font("맑은 고딕", Font.PLAIN, 12);

        Choice choice = new Choice();
        choice.setFont(koreanFont);
        choice.addItem("Superman");
        choice.addItem("Betman");

        add(choice);

        setVisible(true);

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange());
                System.out.println(ItemEvent.SELECTED);
                System.out.println(e.getItem());
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("선택된 항목: " + e.getItem());
                }
            }
        });
    }

    public static void main(String[] args) {
        new ChoiceA();
    }
}
