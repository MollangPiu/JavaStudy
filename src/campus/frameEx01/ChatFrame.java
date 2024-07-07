package campus.frameEx01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatFrame extends JFrame {
    private DefaultListModel<String> model;
    private JList<String> jList;
    private JTextField chatInput;
    private JButton sendButton, enterButton, exitButton;
    private boolean canChat = false;
    private JFrame loginFrame;

    public ChatFrame(JFrame loginFrame) {
        this.loginFrame = loginFrame;
        setTitle("Chat Interface");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        model = new DefaultListModel<>();
        jList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(jList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        chatInput = new JTextField();
        chatInput.setEnabled(false);
        sendButton = new JButton("전송");
        sendButton.setEnabled(false);
        inputPanel.add(chatInput, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (canChat) {
                    String text = chatInput.getText();
                    if (!text.isEmpty()) {
                        model.addElement(DataFrame.loginId+": "+text);
                        chatInput.setText("");
                    }
                }
            }
        });



        JPanel buttonPanel = new JPanel();
        enterButton = new JButton("입장");
        exitButton = new JButton("나가기");
        exitButton.setVisible(false);
        buttonPanel.add(enterButton);
        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.NORTH);

        enterButton.addActionListener(e -> {
            model.addElement(DataFrame.loginId+"님이 입장 되었습니다.");
            canChat = true;
            chatInput.setEnabled(true);
            sendButton.setEnabled(true);
            enterButton.setVisible(false);
            exitButton.setVisible(true);
        });

        exitButton.addActionListener(e -> {
            model.addElement(DataFrame.loginId+"님이 퇴장 되었습니다.");
            canChat = false;
            chatInput.setEnabled(false);
            sendButton.setEnabled(false);
            enterButton.setVisible(true);
            exitButton.setVisible(false);
            this.dispose();
            loginFrame.setVisible(true);
        });
    }

}
