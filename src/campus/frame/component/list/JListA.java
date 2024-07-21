package campus.frame.component.list;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListA extends JFrame {

    public JListA() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("항목 1");
        listModel.addElement("항목 2");
        listModel.addElement("항목 3");

        // JList 생성
        JList<String> list = new JList<>(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 단일 선택 모드

        // 스크롤 패널에 JList 추가
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);


        // 선택 이벤트 리스트 체크하기
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedValue = list.getSelectedValue();
                    System.out.println("선택된 항목: " + selectedValue);
                }
            }
        });


        setVisible(true);
    }

    public static void main(String[] args) {
        new JListA();
    }
}
