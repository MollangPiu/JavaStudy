package campus.test;

import java.util.Scanner;

public class Game01 {
    public static void main(String[] args) {
        //가위1, 바위2, 보3.
        Scanner sc = new Scanner(System.in);
        while(true) {
            int computer = (int)(Math.random()*3)+1;
            System.out.println("무엇을 내시겠습니까.");
            int num = sc.nextInt();
            
            if(computer == 1) {
                System.out.println("컴퓨터: 가위");
            } else if(computer == 2) {
                System.out.println("컴퓨터: 주먹");
            } else
                System.out.println("컴퓨터: 보");

            //비겼을 때.
            if(computer == num) {
                System.out.println("비겼습니다.");
            }
            //졌을 때
            //computer / num
            //1 / 3
            //2 / 1
            //3 / 2
            else if(computer-num==1 || (computer==1 && computer-num == -2)) {
                System.out.println("졌습니다.");
            }
            //이겼을 때
            //computer / num
            // 1 / 2
            // 2 / 3
            // 3 / 1
            else if(computer-num == -1 || (computer==3 && computer-num == 2)) {
                System.out.println("이겼습니다.");
                break;
            }

        }
    }
}
