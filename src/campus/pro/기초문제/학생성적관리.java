import java.util.ArrayList;
import java.util.Scanner;

public class 학생성적관리 {

    private static class StudentVO {
        private String name;
        private int korScore;
        private int engScore;
        private int mathScore;

        public StudentVO(String name, int korScore, int engScore, int mathScore) {
            this.name = name;
            this.korScore = korScore;
            this.engScore = engScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public void setKorScore(int korScore) {
            this.korScore = korScore;
        }

        public void setEngScore(int engScore) {
            this.engScore = engScore;
        }

        public void setMathScore(int mathScore) {
            this.mathScore = mathScore;
        }

        @Override
        public String toString() {
            return "이름: " + name + ", 국어: " + korScore + ", 영어: " + engScore + ", 수학: " + mathScore;
        }
    }

    private ArrayList<StudentVO> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. 등록 | 2. 출력 | 3. 삭제 | 4. 수정 | 0. 종료");
            System.out.print("메뉴 선택: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    printStudents();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 0:
                    System.out.println("프로그램 종료.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void registerStudent() {
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("국어 점수: ");
        int kor = Integer.parseInt(scanner.nextLine());
        System.out.print("영어 점수: ");
        int eng = Integer.parseInt(scanner.nextLine());
        System.out.print("수학 점수: ");
        int math = Integer.parseInt(scanner.nextLine());

        studentList.add(new StudentVO(name, kor, eng, math));
        System.out.println("학생 등록 완료.");
    }

    private void printStudents() {
        if (studentList.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.println("==== 학생 목록 ====");
        for (StudentVO student : studentList) {
            System.out.println(student);
        }
    }

    private void deleteStudent() {
        System.out.print("삭제할 학생 이름: ");
        String name = scanner.nextLine();

        boolean removed = studentList.removeIf(student -> student.getName().equals(name));

        if (removed) {
            System.out.println("삭제 완료.");
        } else {
            System.out.println("해당 이름의 학생이 없습니다.");
        }
    }

    private void updateStudent() {
        System.out.print("수정할 학생 이름: ");
        String name = scanner.nextLine();

        for (StudentVO student : studentList) {
            if (student.getName().equals(name)) {
                System.out.print("새 국어 점수: ");
                student.setKorScore(Integer.parseInt(scanner.nextLine()));
                System.out.print("새 영어 점수: ");
                student.setEngScore(Integer.parseInt(scanner.nextLine()));
                System.out.print("새 수학 점수: ");
                student.setMathScore(Integer.parseInt(scanner.nextLine()));
                System.out.println("수정 완료.");
                return;
            }
        }

        System.out.println("해당 이름의 학생이 없습니다.");
    }





    public static void main(String[] args) {
        new 학생성적관리().start();
    }
}
