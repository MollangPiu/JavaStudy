package campus.frame.student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationFrame extends JFrame {
    private JTextField nameField, korScoreField, engScoreField, mathScoreField;
    private JButton registerButton;
    private DefaultListModel<Student> studentModel;

    public StudentRegistrationFrame(DefaultListModel<Student> studentModel) {
        super("학생 등록");
        this.studentModel = studentModel;
        setLayout(new GridLayout(5, 2, 5, 5));
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("이름:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("국어점수:"));
        korScoreField = new JTextField();
        add(korScoreField);

        add(new JLabel("영어점수:"));
        engScoreField = new JTextField();
        add(engScoreField);

        add(new JLabel("수학점수:"));
        mathScoreField = new JTextField();
        add(mathScoreField);

        registerButton = new JButton("등록");
        registerButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String name = nameField.getText();
                        String korScore = korScoreField.getText();
                        String engScore = engScoreField.getText();
                        String mathScore = mathScoreField.getText();
                        Student newStudent = new Student();
                        newStudent.setName(name);
                        newStudent.setKorScore(Integer.parseInt(korScore));
                        newStudent.setEngScore(Integer.parseInt(engScore));
                        newStudent.setMathScore(Integer.parseInt(mathScore));
                        studentModel.addElement(newStudent);
                        JOptionPane.showMessageDialog(StudentRegistrationFrame.this, "학생 등록 완료!");
                        dispose();
                    }
                }
    );
        add(registerButton);

        setVisible(true);
    }


}
