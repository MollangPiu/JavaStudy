package campus.frame;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("BorderLayout");

        jFrame.setLayout(new BorderLayout());

        // 각 방향에 지정
        jFrame.add(new JButton("NORTH"), BorderLayout.NORTH);   //북
        jFrame.add(new JButton("EAST"), BorderLayout.EAST);    //동
        jFrame.add(new JButton("SOUTH"), BorderLayout.SOUTH);   //남
        jFrame.add(new JButton("WEST"), BorderLayout.WEST);    //서
        jFrame.add(new JButton("CENTER"), BorderLayout.CENTER);  //가운데

        // 기본 닫기 작업 설정
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //화면 크기
        jFrame.setSize(300, 200);

        //프레임 화면 가운데 위치
        jFrame.setLocationRelativeTo(null);

        jFrame.setVisible(true);
    }
}
