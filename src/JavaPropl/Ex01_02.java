package JavaPropl;

import java.util.Scanner;

/**
 * 숫자야구
 */
public class Ex01_02 {

    public static void main(String[] args) {
        int random = (int)(Math.random()*999);
        String str = String.format("%03d" ,random); //앞자리 0 채우기
        System.out.println("컴퓨터: "+str);

        int strike = 0;
        do {
            System.out.println("== 입력해주세요 ==");
            Scanner sc = new Scanner(System.in);
            String result = sc.next();
            System.out.println("입력된 값 : " + result);

            int index = 3;  //자릿수
            int ball = 0;   //ball 갯수
            strike = 0; //stike 갯수

            char[] computer = str.toCharArray();    //결과
            char[] check = result.toCharArray();    //사용자 입력값
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(check[i]) == -1) {
                    continue;
                } else if (computer[i] == check[i]) {
                    strike++;
                } else {
                    ball++;
                }
            }

            System.out.println("strike: "+strike);
            System.out.println("ball: "+ball);
        } while (strike != 3);

        System.out.println("정답입니다.");

        
        


    }
}
