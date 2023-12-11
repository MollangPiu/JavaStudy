package campus.ch02.pro01;

public class ForCreate {

    public static void main(String[] args) {

        //for(초기문, 조건문, 증감문)
        for(int i = 0; i < 10; i++) {
            System.out.println("i: "+i);
        }

        int count = 0;
        for(; count < 10; ) {
            System.out.println("count: "+count);
            count++;
        }


        for(int i = 10; i >= 0; i--) {
            System.out.println("i: "+i);
        }

        //증감문에 대한 예시, 증감문을 이렇게 쓰면 가독성에서 문제 생길 수 있다.
        int num = 100;
        for(int i = 100; i > 0; i-=10, num = 100) {
            System.out.println("i: " + i);
            System.out.println("before num: " + num);
            num = 10;
            System.out.println("after num: " + num);
        }


        //for([for문 안에서만 사용 할 변수 선언]; [for 혹은 반복 조건 종료 조건]; [한 바퀴가 수행 완료되면 수행 될 조건])
        for(int joker = 10, num01 = 0; num01 < 10; num01++, joker--) {
            System.out.println("joker: "+joker+" / num01: "+num01);
        }
        // num01 = 50; for문에서 선언했으므로, for문 밖에서는 해당 변수를 사용 할 수 없다.


        //num이라는 int타입을 for문 밖에서 선언을 했다.
        num = 50;
        for(num = 0; num < 10; num++) {
            //num을 초기선언에는 50이지만
            //for문 시작하면서 0을 선언했으므로, 0부터 시작.
            System.out.println("num: "+num);
        }

        for(num = 50; num >= 0; num--) {
            if(num%2 == 0) {
                continue;
            }
            System.out.println("num: "+num);
        }

        System.out.println("==================================");
        //Quiz 구구단 만들기


        System.out.println("===================================");
        //2중 for문
        for(int i=0; i < 0; i++) {
            System.out.println("[i]: "+i);
            for(int j=0; j < 10; j++) {
                System.out.println("i: "+i+" / j: "+j);
            }
        }

        System.out.println("===================================");
        //구구단 만들기


        System.out.println("===================================");
        //별 만들기
        for(int i=0; i <= 5; i++) {
            for(int j=0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================================");
        //별 만들기 2
        for(int i=0; i < 5; i++) {
            for(int j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("==================================");
        //별만들기 3
        /*
        *****
         ****
          ***
           **
            *
         */
        //별 만들기 4
        /*
          *
         ***
        *****
         */

        //별 만들기 5
        /*
          *
         ***
        *****
         ***
          *
         */


    }
}
