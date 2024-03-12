package campus.study;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
//		String[] arr = new String[5];

        // 배열 사용하기 위해서는 반드시 반복문이 따라 온다.
        // 배열이 있는 곳에는 이 놈은 반드시 있다. for, do while, while
        // for얘가 제일 쉽다. 가독성 좋다.. forEach x

        // 배열이란 결국 아파트하고 비슷하다.
        // 그냥 변수는 1인 가정 주택이면, 배열은 층마다 있는 집이다.

        /*
         * for(int i = 0; i < arr.length; i= i+1) { arr[i] = "a"; }
         *
         * for(int i=0; i < arr.length; i++) { System.out.println(arr[i]); }
         */

//		String [] str = new String[5];	//열

        /*
         * * *** ***** *** * 0 2 1 1 2 0 3 1 4 2
         *
         */

        //String[][] star = new String[5][5];

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int checkNum = Math.abs(i - num/2);
            //System.out.println(checkNum);
            for (int j = 0; j < num; j++) {
                if (j < checkNum || num-checkNum<= j) {
                    System.out.print(" ");
                } else {
                    System.out.print("★");

                }
            }

            System.out.println();
        }

    }

}