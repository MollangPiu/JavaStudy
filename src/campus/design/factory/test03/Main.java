package campus.design.factory.test03;

class Main {

    public static void main(String[] args) {

        Card studentCard = new StudentCard("슈퍼맨");
        studentCard.use();

        StudentCardFactory studentCardFactory = new StudentCardFactory();
        Card card01 = studentCardFactory.create("슈퍼맨");
        Card card02 = studentCardFactory.create("배트맨");

        card01.use();
        card02.use();
    }
}
