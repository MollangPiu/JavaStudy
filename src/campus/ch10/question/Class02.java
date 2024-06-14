package campus.ch10.question;

class Class02 {

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();

        basket1.fruit = "사과";
        basket2.fruit = "바나나";
        basket3.fruit = "수박";

        System.out.println(basket1.fruit);
        System.out.println(basket2.fruit);
        System.out.println(basket3.fruit);
    }
}

class Basket {

    String fruit;
}
