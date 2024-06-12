package campus.ch10;

class Class02 {

    public static void main(String[] args) {
        Student student01 = new Student();
        student01.name = "짱구";
        student01.age = 5;

        Student student02 = new Student();
        student02.name = "철수";
        student02.age = 10;

        Student student03 = new Student();
        student03.name = "홍길동";
        student03.age = 18;

        System.out.println(student01.name);
        System.out.println(student01.age);
        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student03.name);
        System.out.println(student03.age);

    }
}