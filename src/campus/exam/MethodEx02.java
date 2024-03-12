package campus.exam;

public class MethodEx02 {

    public static void main(String[] args) {
        System.out.println(MethodEx02.resultNum(5));
    }

    static int resultNum(int num) {
        if(num == 1) {
            return num;
        } else {
            return num * resultNum(num - 1);
        }
    }
}
