package campus.frame.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx {

    public static void main(String[] args) {

        // 프레임 생성
        JFrame frame = new JFrame("GridLayout Example");

        // 프레임에 GridLayout 매니저 설정 (3행 3열)
        frame.setLayout(new GridLayout(3, 3));

        // 버튼 추가
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        // 기본 닫기 작업 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 프레임 사이즈 설정
        frame.setSize(300, 300);
        // 프레임을 화면 가운데에 위치시킴
        frame.setLocationRelativeTo(null);
        // 프레임을 보이게 설정
        frame.setVisible(true);

    }
}
