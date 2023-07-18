package Test;

public class IntTest {

    public static void main(String[] args) {
        int num = -5;
        System.out.println(Integer.toBinaryString(num));

        System.out.println(num>>31);
        System.out.println(Integer.toBinaryString(num>>31));

        int num2 = -1;
        System.out.println(num2>>2);
        System.out.println(Integer.toBinaryString(num2 >> 2));

        int num3 = -2147483648;
        System.out.println(Integer.toBinaryString(num3>>5));
        System.out.println(num3>>5);

        int num4 = 2147483647;
        System.out.println(num4>>31);
    }
}