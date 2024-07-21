package campus.frame.img;

import javax.swing.*;
import java.awt.*;

public class ImageSize extends JFrame {

    public ImageSize() {
        setTitle("이미지 불러오기");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //경로 지정하기
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\User\\Downloads\\a2.jpeg");
        Image image = imageIcon.getImage();

        // 원하는 크기로 이미지 조정
        Image resizedImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel label = new JLabel(resizedIcon);

        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageSize();
            }
        });
    }
}