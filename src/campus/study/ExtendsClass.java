package campus.study;

class Parent {
    Parent() {
        System.out.println("Supser Class");
    }
}
public class ExtendsClass extends Parent{

    ExtendsClass() {
        //super();
        System.out.println("Supser Class");
        System.out.println("Child");
    }
    public static void main(String[] args) {

        ExtendsClass extendsClass = new ExtendsClass();
    }
}
