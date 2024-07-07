package campus.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameEx02 extends JFrame implements ActionListener {

    private JTextField msg;

    public JFrameEx02() {

        setSize(300, 200);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        //문자열 입력할 수 있다.
        msg = new JTextField(10);

        //전송버튼
        JButton sendBtn = new JButton("전송");
        sendBtn.setActionCommand("send");
        sendBtn.addActionListener(this);
        add(sendBtn);

        JPanel panel = new JPanel();
        panel.add(msg);
        panel.add(sendBtn);

        add(panel);
        setVisible(true);
    }

    //ActionListener 인터페이스를 구현해서 강제로 Override 한 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트가 발생한 버튼에 설정된 action command 읽어오기
        String command=e.getActionCommand();
        if(command.equals("send")) {
            //JTextField에 입력한 문자열 읽어오기
            String msg = this.msg.getText();
            JOptionPane.showMessageDialog(this, msg);
        }


    }



    public static void main(String[] args) {
        new JFrameEx02();
    }
}
