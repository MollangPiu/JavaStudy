package campus.pro.기본.pro02;

class DataType {

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


        System.out.println("==========================");
        
        //진법 표현하기
        System.out.println(0b101);  //2진수
        System.out.println(0111);   //8진수
        System.out.println(0xC);    //16진수

        System.out.println(0XA);
        System.out.println(0xA);
        System.out.println(0xa);


        final String NAME = "상수를 저장합니다.";
        //NAME = "final을 지정하게 되면, 해당 변수는 수정이 불가능 합니다.";

        //static int number = 100;
    }
}
