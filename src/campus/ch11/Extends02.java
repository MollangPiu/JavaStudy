package campus.ch11;


/**
 * 필드 재사용 name을 Mart클레스에서 재사용이 가능하다
 * 이를 활용하여, method 또한 재 사용이 된다는 것을 알리면 된다.
 */

public class Extends02 {

    public static void main(String[] args) {

        Mart mart = new Mart();
        mart.setName("A마트");


        System.out.println(mart.getName());
        mart.getStore();
    }
}

class Store {
    String name = "가게이름";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void getStore() {
        System.out.println("판매 목록");
    }
}

class Mart extends Store {

    @Override
    public void getStore() {
        System.out.println("우유");
        System.out.println("과자");
        System.out.println("냉동");
    }
}
