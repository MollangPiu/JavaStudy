package campus.frame.layoutStart;

import javax.swing.*;
import java.awt.*;

public class LayoutB extends JFrame {

    public LayoutB() {
        setSize(800, 500);
        setLocation(0, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton btn = new JButton("버튼 - BTN2");
        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutB();

        //BTN 닫을 때 참고 사항
        //DO_NOTHING_ON_CLOSE: 닫기 버튼 눌러도 동작하지 않음
        //HIDE_ON_CLOSE: 프레임 숨기기
        //DISPOSE_ON_CLOSE: 프레임 닫고, 프레임과 관련된 지원을 헤제
        //EXIT_ON_CLOSE: 전체 프로그램 종류

    }
}
