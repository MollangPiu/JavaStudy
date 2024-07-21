package campus.frame.layoutStart;

import javax.swing.*;
import java.awt.*;

public class LayoutA {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        //size 크기 조절 ( width, height )
        jFrame.setSize(800, 500);

        jFrame.setLocation(0, 100); // 창 위치 고정하기

        //닫기 버튼
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 버튼 추가하기
        JButton btn = new JButton("버튼");
        jFrame.add(btn);

        jFrame.setVisible(true);
    }
}
