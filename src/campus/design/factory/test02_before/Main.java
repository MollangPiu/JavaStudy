package campus.design.factory.test02_before;

class Main {

    public static void main(String[] args) {

        StudentProduct studentCard = new StudentProduct("슈퍼맨");
        studentCard.use();

        Product student02 = new StudentProduct("배트맨");
        student02.use();
    }
}
