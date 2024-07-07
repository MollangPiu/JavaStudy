package campus.frame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JFrameEx03 extends JFrame {

    private DefaultListModel<String> model;
    private JList<String> jList;
    private JTextField chatInput;
    private JButton sendButton;
    private JButton enterButton;
    private JButton exitButton;
    private boolean canChat = false;

    public JFrameEx03() {
        // 윈도우 설정
        setTitle("Chat Interface");
        setSize(400, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 채팅 목록
        model = new DefaultListModel<>();
        jList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(jList);
        add(scrollPane, BorderLayout.CENTER);

        // 입력 필드 및 전송 버튼
        JPanel inputPanel = new JPanel(new BorderLayout());
        chatInput = new JTextField();
        chatInput.setEnabled(false);  // 초기에는 입력 불가
        sendButton = new JButton("전송");
        sendButton.setEnabled(false);  // 초기에는 버튼 비활성화
        inputPanel.add(chatInput, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        // 전송 버튼 액션
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (canChat) {
                    String text = chatInput.getText();
                    if (!text.isEmpty()) {
                        model.addElement(text);
                        chatInput.setText("");
                    }
                }
            }
        });


        // 상단 버튼 패널
        JPanel buttonPanel = new JPanel();
        enterButton = new JButton("입장");
        exitButton = new JButton("나가기");
        exitButton.setVisible(false);  // 처음에는 나가기 버튼을 숨김
        buttonPanel.add(enterButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.NORTH);

        // 입장 버튼 액션
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addElement("입장 되었습니다.");
                canChat = true;
                chatInput.setEnabled(true);
                sendButton.setEnabled(true);
                enterButton.setVisible(false);
                exitButton.setVisible(true);
            }
        });
        
        //나가기 버튼 클릭
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addElement("퇴장 되었습니다.");
                canChat = false;
                chatInput.setEnabled(false);
                sendButton.setEnabled(false);
                enterButton.setVisible(true);
                exitButton.setVisible(false);
            }
        });

        // 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameEx03();
    }
}