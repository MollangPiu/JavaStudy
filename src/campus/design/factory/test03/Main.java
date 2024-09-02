package campus.design.factory.test03;

class Main {

    public static void main(String[] args) {

        Product studentCard = new StudentProduct("슈퍼맨");
        studentCard.use();

        StudentProductFactory studentCardFactory = new StudentProductFactory();
        Product card01 = studentCardFactory.create("슈퍼맨");
        Product card02 = studentCardFactory.create("배트맨");

        card01.use();
        card02.use();
    }
}
