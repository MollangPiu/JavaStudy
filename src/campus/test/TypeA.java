package campus.test;

public class TypeA {

    public static void main(String[] args) {

        // 기본타입: 8개, 참조: 1개.

        //Stack - Heap
        //Stack: 진짜 내가 저장한 Value가 저장 된 곳-> Heap의 저장 장소의 주소값.
        //Heap: 내가 저장한 Value 저장 된 곳.


        //모든 언어의 규칙. C언어. => 포인터.
        // JVM JAVA
        //기초타입: STACK에 데이터를 임시 저장.


        //가비지 컬렉터: 메모리 관리.
        //쓰레기통 연결.
        // heap


        //기본타입

        //숫자
        //정수 (음수, 양수)
        //byte(8bit): -128 ~ 127
        //short(2byte): 3만 2천
        //int(4byte): 21억 2147483648
        //long(8byte) 322경.

        byte by = 127;
        short sh = 32000;
        int in = 200000;
        long lo = 200000L; // long 을 사용할때는 숫자의 뒤에 l, L: 소문자는 1과 구분이 어려우니깐 대문자 L을 사용 한다.

        //int로 쓰자.
        //실수 (음수, 양수, 소수점)
        //float, double
        float fl = 200.00F; // f, F 둘 중 하나를 정의. 소문자는 구분하기 어려우니깐~ 그래서 대문자 F를 사용한다.
        double do1 = 200.00;

        //실수: double, float.(10만)

        //문자
        //char: 문자. 'a', 'b' 2byte. 1byte.
        //컴퓨터는 강대국의 상징. 영어. 1byte. 문자, 컴퓨터에있는 특수문자.
        //char는 문자를 나타내지만 실제 데이터를 저장하는 것은 숫자로 저장. 2bye =>
        char ch = 'a'; //특징은 ★★★★★★★★★작은 따음표
        char ch1 = '가';

        //String=> char의 배열. 문자열

        //논리 ( 참, 거짓 )
        //boolean 조건을 따져.참, 거짓. 0과 0이아닌 수자.
        //boolean true:참, false: 거짓
        boolean tr = true;
        boolean fa = false;

        //출력
        System.out.println("Hello World");
        System.out.println(fl);

        System.out.print(do1+"   Hello");
        System.out.print(" World\n");
        System.out.printf("c언어 문법: %d %d %d", in, by, sh);



        //String
        //참조
        //stack - heap
        String st = "여러 글자 됩니다.";
        System.out.println(st);


        // == != > < >= <=
        // stack이 같은지 비교하는 것. ( heap이 같은지 비교하는 것이 아니다. )
        System.out.println(10 == 10);  // 기본타입은 stack에 값을 저장.
        System.out.println(100 > 50);

        System.out.println('a' == 'a');
        System.out.println('a' == 97);


        //String은 stack-heap의 연관 관계이기 때문에, ==으로 비교하면, 큰 일납니다.
        System.out.println("hello" == "hello");

        String str1 = "apple";
        String str2 = "apple";
        String str3 = new String("apple");
        String str4 = new String("apple");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


        // 비트.
        // 논지 1 0 => 1, 0
        // 4: 100, 7: 111
        System.out.println(4&7);
        System.out.println(4|7);

        int num1 = 100;
        int num2 = 500;

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        //비트
        //4 << 2 : 4: 100, 16:10000
        System.out.println(4<<32); //32bit => 4byte. int의 메모리 크기
        System.out.println(4<<34);
        System.out.println(7>>32);
        System.out.println(500%32);
        System.out.println(4<<500);
        System.out.println(4<<20); // 100 1000

        //논리 연산자
        //&&: 그리고, AND: 참 그리고 참만 참
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && true && true && false);

        // ||: 또는, or: 조건 중에서 하나라도 참이면 참.
        System.out.println(true || true);   //true
        System.out.println(true || false);   //true
        System.out.println(false || false);   //false
        System.out.println(true || false || true || false);   //true

        //and와 or이 같이 있다고 하면, (괄호)가 없을 때는 and가 우선순위.
        System.out.println(true && false || true && true);  //false || true => true
        System.out.println(true || false && true || false); //true || false || false => true
    }
}
