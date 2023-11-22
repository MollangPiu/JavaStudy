package campus.ch01.pro04;

class Operator {

    public static void main(String[] args) {

        System.out.println(5 + 2);      //7
        System.out.println(5 - 2);      //3
        System.out.println(5 * 2);      //10
        System.out.println(5 / 2);      //2
        System.out.println(5 % 2);      //1

        System.out.println(2 + 2 * 2);

        System.out.println("=======================");
        int num = 10;

        num = num + 5;
        System.out.println(num);

        num = num / 3;
        System.out.println(num);

        num+=5;
        System.out.println(num+=5);
        System.out.println(num);

        num = num + 1;   //이를 num++ 혹은 ++num으로 할 수 있다.
        System.out.println(num);    //16
        System.out.println(num++);
        System.out.println(++num);

        System.out.println("=================================");
        num = 100;
        num = num * 5;
        System.out.println(num);

        System.out.println("=================================");
        System.out.println(10 == 10);       //true
        System.out.println(100 > 25);       //true
        System.out.println(0 > 50);         //false
        System.out.println(50 >= 50);       //true
        System.out.println(100 <= 20);      //false




        
        System.out.println("=================================");
        //논리 연산자
        System.out.println(true && true);           //true
        System.out.println(true && false);          //false
        System.out.println(false && false);         //false

        System.out.println(true || true);           //true
        System.out.println(true || false);          //true
        System.out.println(true || false);          //false

        System.out.println("=================================");
        //응용하기
        System.out.println((100 > 50) && (66 < 100));       //true
        System.out.println((100 > 50) && (30 > 100));       //false
        System.out.println((50 == 100) || (100 == 100));    //true
        System.out.println((50 == 100) || (100 < 50));      //false

        System.out.println("==================================");
        //논리적 베타적
        System.out.println(true^true);          //서로 같은 값이므로 false
        System.out.println(false^true);         //서로 다른 값이므로 true
        System.out.println(true^false);         //서로 다른 값이므로 true
        System.out.println(false^false);        //서로 같은 값이므로 fasle

        System.out.println("==================================");
        //부정
        System.out.println(!true);              //false
        System.out.println(!false);             //true


        System.out.println("==================================");
        int num1 = 100;
        int num2 = 50;
        int num3 = 75;

        System.out.println(num1 == num2 || num1 < num2);            //false
        System.out.println(num1 == num2 || !(num1 < num2));         //true
        System.out.println(num2 < num3 && !(num1 < num2));          //true


        System.out.println("==================================");


        //삼합 연산자
        System.out.println((100==100)?"참":"거짓");
        String stuName = (50==50)?"영희":"철수";
        System.out.println("학생의 이름은 ? "+stuName);


        System.out.println("==================================");
        //연산자 Quiz
        int score = 100;
        int num10 = 0, num11 = 0;
        num10 = (score > 90)?100:50;
        num11 = (score < 100)?100:50;


        System.out.println("num10: "+num10);
        System.out.println("num11: "+num11);

        System.out.println((100==100));
        System.out.println(50 < 55);
        System.out.println(105 >= 50);
        System.out.println(200 <= 150);
        System.out.println(50 != 50);
        System.out.println(80 != 100 && (num10 != num11));
    }
}
