package campus.test;

import java.util.Scanner;

public class 주차요금정산 {

    public static void main(String[] args) {

        //조건문 활용하여 주차 요금 정산 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        System.out.println("1: 경차 / 2번: 장애인차량 / 3번: 일반");
        int grade = sc.nextInt();   //1번, 2번, 3번.

        System.out.println("주차 시간을 입력하세요.");
        int time = sc.nextInt();

        int price = 4000; //주차 1시간당 가격.

        //주차 시간에 대한 계산
        int result = price*time;

        if(result > 30000) {
            result = 30000;
        }
        if(grade == 1 || grade == 2)
        {
            //result = result/2;
            result /= 2;
        }
        System.out.printf("주차요금은 %d입니다.", result);

        System.out.println("=====================================");
        result = 0;
        for(int i =0; i < time; i++) {
            result+=price;
            if(result>30000) {
                result = 30000;
                break;
            }
        }
        if(grade == 1 || grade == 2) {
            result /= 2;
        }
        System.out.printf("주차요금은 %d입니다.", result);

    }
}
