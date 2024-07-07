package campus.frame;

import javax.swing.*;
import java.awt.*;

public class FrameEx01 extends JFrame {

    public FrameEx01() {
        setSize(800, 500); //창 크기 width, height
        setLocation(0, 100); //창 위치 x, y (가로, 세로)

        //닫기 버튼
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //DO_NOTHING_ON_CLOSE: 닫기 버튼 눌러도 동작하지 않음
        //HIDE_ON_CLOSE: 프레임 숨기기
        //DISPOSE_ON_CLOSE: 프레임 닫고, 프레임과 관련된 지원을 헤제
        //EXIT_ON_CLOSE: 전체 프로그램 종류

        //내용물 왼쪽 정렬.
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton btn = new JButton("버튼");

        add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameEx01();
    }
}
