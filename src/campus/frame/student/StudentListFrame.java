package campus.frame.student;

import javax.swing.*;
import java.awt.*;

public class StudentListFrame extends JFrame {
    private JList<Student> studentList;

    public StudentListFrame(DefaultListModel<Student> studentModel) {
        super("학생 리스트");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        studentList = new JList<>(studentModel);
        studentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // 메인 패널 설정
        JPanel mainPanel = new JPanel(new BorderLayout());

        // 스크롤 팬을 리스트에 추가
        JScrollPane scrollPane = new JScrollPane(studentList);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // 상단에 등록 버튼 추가
        JButton registerButton = new JButton("새 학생 등록");
        registerButton.addActionListener(e -> {
            // 등록 창 열기: 이 부분은 등록 창을 여는 로직을 구현해야 함
            // 예: new StudentRegistrationFrame(studentModel).setVisible(true);
            new StudentRegistrationFrame(studentModel);
        });
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(registerButton);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // 패널을 프레임에 추가
        add(mainPanel);

        // 프레임을 화면에 표시
        setVisible(true);
    }
}
