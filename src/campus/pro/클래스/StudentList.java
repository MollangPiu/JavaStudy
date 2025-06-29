package campus.pro.클래스;

class StudentList {

    public static void main(String[] args) {

        StudentVO student = new StudentVO();
        student.name = "김다빈";
        student.korScore = 100;
        student.engScore = 100;
        student.mathScore = 100;
        System.out.println("Name: "+student.name+" / 국어점수: "+student.korScore+" / 영어점수: "+student.engScore+" / 수학점수: "+ student.mathScore);

        StudentVO student2 = new StudentVO();
        student2.name = "정우성";
        student2.korScore = 95;
        student2.engScore = 95;
        student2.mathScore = 95;
        System.out.println("Name: "+student2.name+" / 국어점수: "+student2.korScore+" / 영어점수: "+student2.engScore+" / 수학점수: "+ student2.mathScore);


        StudentVO[] students = new StudentVO[5];

        System.out.println(students.length);

        students[0] = new StudentVO();
        students[0].name = "에니언";
        students[0].korScore = 50;
        students[0].engScore = 50;
        students[0].mathScore = 50;

        students[1] = new StudentVO();
        students[1].name = "베이지";
        students[1].korScore = 67;
        students[1].engScore = 54;
        students[1].mathScore = 90;

        students[2] = new StudentVO();
        students[2].name = "마이클";
        students[2].korScore = 95;
        students[2].engScore = 78;
        students[2].mathScore = 60;

        for(int i = 0; i < students.length; i++) {
            System.out.println("Name: "+students[i].name+" / 국어점수: "+students[i].korScore
                    +" / 영어점수: "+students[i].engScore+" / 수학점수: "+ students[i].mathScore);
        }


    }
}


class StudentVO {
    String name;
    int korScore;
    int engScore;
    int mathScore;
}
