package campus.design.observer.pro02;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    List<Student> students = new ArrayList<>();

    @Override
    public void regist(Student student) {
        students.add(student);
    }

    public void print() {
        for(Student stu : students) {
            stu.info();
        }
    }
}
