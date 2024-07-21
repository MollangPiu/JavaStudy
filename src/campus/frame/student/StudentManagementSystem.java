package campus.frame.student;

import javax.swing.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DefaultListModel<Student> studentModel = new DefaultListModel<>();
            new StudentListFrame(studentModel);
        });
    }
}
