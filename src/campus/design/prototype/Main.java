package campus.design.prototype;

public class Main {

    public static void main(String[] args) {
        NoPrototypeExample no1 = new NoPrototypeExample("Superman");
        NoPrototypeExample no2 = no1;

        if(no1 == no2) {
            System.out.println("true");
        }
    }
}
