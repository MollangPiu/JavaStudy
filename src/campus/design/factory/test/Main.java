package campus.design.factory.test;

class Main {

    public static void main(String[] args) {
        IDCardFectory factory = new IDCardFectory();
        Product idCard1 = factory.createProduct("슈퍼맨");
        Product idCard2 = factory.createProduct("배트맨");

        idCard1.use();
        idCard2.use();


        IDCard idCard3 = IDCard.Factory.create("조커");
        idCard3.use();
    }
}
