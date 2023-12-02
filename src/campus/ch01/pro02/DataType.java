package campus.ch01.pro02;

public class DataType {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("안녕하세요.");
        System.out.println(100);
        System.out.println(-50);
        System.out.println(1.23456);
        System.out.println(true);




        System.out.println("==============================");

        //byte, short, int, Long
        byte by = 120;
        short sh = 32700;
        int in = 2147483647;
        Long lo = 9223372036854775807L;

        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lo);



        System.out.println("==========================");
        int num = 9156;
        int score = 50;
        int password = 1234;
        System.out.println(in*160);
        System.out.println(in*-1*150);

        System.out.println("==========================");
        System.out.println(0111);
        System.out.println(0xC);
        System.out.println(0b101);


        System.out.println("==========================");
        //float, double
        float fl = 12.34567890F;
        double dou = 12.34567890123456789;
        System.out.println(fl);
        System.out.println(dou);

        double num1 = 12.23;
        double num2 = 34.45;
        System.out.println(num1+num2);
        System.out.println("==========================");
        boolean bo = true;
        System.out.println(bo);
        //boolean
        System.out.println(10 > 8);
        System.out.println(10 > 200);
        System.out.println(8 == 8);
        System.out.println(10 != 1);

        System.out.println("==========================");
        char ch = 'a';
        char ch1 = 97;
        System.out.println(ch);
        System.out.println(ch1);

        System.out.println("==========================");
        String str = "Apple";
        System.out.println(str);
        System.out.println("Hello World");
        System.out.println("수고하셨습니다.");
    }
}
