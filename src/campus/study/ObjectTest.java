package campus.study;

public class ObjectTest {

    int data = 500;
    String str = "computer";

    public static void main(String[] args) {
        ObjectTest obj = new ObjectTest();

        int num = 100;
        String str = "String";
        String str2 = new String();

        str = "apple";
        System.out.println(str);
        System.out.println(obj.str);
        System.out.println(obj.data);

    }
}
