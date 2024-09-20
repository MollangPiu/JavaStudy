package campus.design.factory.test04;

public class PhoneFactory {

    public Samsung create() {

        System.out.println("핸드폰 기능");
        return new Samsung();
    }
}
