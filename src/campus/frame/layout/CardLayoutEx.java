package campus.frame.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutEx {

    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 카드레이아웃 및 메인 패널 생성
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // 각 카드 생성
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        card1.setBackground(Color.CYAN);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.setBackground(Color.GREEN);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        card3.setBackground(Color.MAGENTA);

        // 카드 패널에 카드 추가
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // 컨트롤 패널 생성 및 버튼 추가
        JPanel controlPanel = new JPanel();
        JButton nextButton = new JButton("Next");
        JButton prevButton = new JButton("Previous");

        // 버튼 이벤트 리스너 추가
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel);
            }
        });

        // 컨트롤 패널에 버튼 추가
        controlPanel.add(prevButton);
        controlPanel.add(nextButton);

        // 프레임에 패널 추가
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        // 프레임 설정
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
