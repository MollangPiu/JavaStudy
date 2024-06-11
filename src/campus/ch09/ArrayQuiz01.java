package campus.ch09;

import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        //원하는 커피 4가지 담기
        String [] coffieMenu = new String[4];

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 커피메뉴: ");
        coffieMenu[0] = sc.nextLine();

        System.out.print("두번째 커피메뉴: ");
        coffieMenu[1] = sc.nextLine();

        System.out.print("세번째 커피메뉴: ");
        coffieMenu[2] = sc.nextLine();

        System.out.print("네번째 커피메뉴: ");
        coffieMenu[3] = sc.nextLine();

        for(int i = 0; i < coffieMenu.length; i++) {
            System.out.println(coffieMenu[i]);
        }
    }
}
