package campus.ch02.pro01;

public class WileCreate {

    public static void main(String[] args) {

        //while(조건문)

        //while(비교 연산자)
        //조건이 true이면, 계속해서 반복한다.
        /*while(true) {
            System.out.println("실행");
        }*/

        System.out.println("======================");

        //while 사용하는 첫 번째 방법
        int count = 0;  //이를 cnt라고 줄인다.
        while(count < 10) {
            System.out.println("count: "+count);
            count++;
        }

        System.out.println("check");
        int count01 = 0;
        while(true) {
            System.out.println("count01: "+count01);
            count01++;
            if(count01 > 10) {
                break;
            }
        }

        int num = 0;
        while(num < 50) {
            num++;
            if(num%2 == 0) {
                continue;
            }
                System.out.println("num: "+num);
        }

    }
}
