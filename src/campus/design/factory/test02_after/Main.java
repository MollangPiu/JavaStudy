package campus.design.factory.test02_after;

class Main {

    public static void main(String[] args) {

        StudentCard studentCard = new StudentCard("슈퍼맨");
        studentCard.use();
        StudentCard studentCard02 = StudentCard.Factory.create("배트맨");
        studentCard02.use();
    }
}
