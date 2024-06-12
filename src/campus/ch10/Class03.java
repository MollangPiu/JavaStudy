package campus.ch10;

class Class03 {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student();
        students[0].name = "에니언";
        students[0].age = 18;

        students[1] = new Student();
        students[1].name = "베이지";
        students[1].age = 22;

        students[2] = new Student();
        students[2].name = "마이클";
        students[2].age = 21;
    }
}
