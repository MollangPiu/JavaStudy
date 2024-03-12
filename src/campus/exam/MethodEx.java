package campus.exam;

public class MethodEx {

    public static void main(String[] args) {
        System.out.println(MethodEx.check(10));
    }
    static String check(int num) {
        return String.valueOf(num) +" Hello World";
    }
}
