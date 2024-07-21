package campus.frame.socketTest;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ChatWithEmoticons extends JFrame {
    private JTextPane textPane;

    public ChatWithEmoticons() {
        // 창 설정
        setTitle("채팅 예제 - 이모티콘 포함");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        // JTextPane 생성 및 설정
        textPane = new JTextPane();
        textPane.setEditable(false); // 편집 불가능하게 설정
        JScrollPane scrollPane = new JScrollPane(textPane);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // 스타일 설정
        StyledDocument doc = textPane.getStyledDocument();
        //addTextAndEmoji(doc, "안녕하세요! ", "C:\\test\\gomimg");

        System.out.println("반응 체크");
        setVisible(true);
    }

    // 텍스트와 이미지(이모티콘) 추가하는 메소드
    private void addTextAndEmoji(StyledDocument doc, String text, String emojiPath) {
        try {
            // 텍스트 추가
            doc.insertString(doc.getLength(), text, null);

            // 이미지 추가
            Style style = doc.addStyle("StyleName", null);
            ImageIcon icon = new ImageIcon(emojiPath);
            JLabel label = new JLabel(icon);
            StyleConstants.setComponent(style, label);
            doc.insertString(doc.getLength(), "ignored text", style);
            System.out.println("123");
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatWithEmoticons();
    }
}
