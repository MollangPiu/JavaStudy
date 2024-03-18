package campus.exam;

import java.util.HashSet;
import java.util.Iterator;

class StudentTest {
    private String name;
    private int score;

    public StudentTest(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


public class HashSetTest {
    public static void main(String[] args) {
        HashSet<StudentTest> set = new HashSet<>();
        set.add(new StudentTest("짱구", 50));
        set.add(new StudentTest("철수", 100));
        Iterator<StudentTest> it = set.iterator();

        for(StudentTest li : set) {
            System.out.println(li.getName());
        }


        while(it.hasNext()) {
            StudentTest studentTest = it.next();
            if(studentTest.getName().equals("짱구")) {
                System.out.println("OK");
            } else {

                System.out.println("None");
            }
            System.out.println(studentTest.getName());
        }

    }

    int num;
    public void test(int num2) {
        int num = num2;
    }
}
