package campus.design.factory.test02_after;

class Main {

    public static void main(String[] args) {

        StudentProduct studentCard = new StudentProduct("슈퍼맨");
        studentCard.use();
        StudentProduct studentCard02 = StudentProduct.Factory.create("배트맨");
        studentCard02.use();
    }
}
