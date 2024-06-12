package campus.ch09.question;

import java.util.Scanner;

class Array02 {

    /**
     * 반복문, if문 활용하여 동일한 메뉴 만들기
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주문 대상 커피 ( 커피, 라떼, 티 )");
        String coffe = sc.nextLine();
        String [] coffeMenu = {"커피", "라떼", "티"};
        for(int i = 0; i < coffeMenu.length; i++) {

            if(coffe.equals(coffeMenu[i])) {
                System.out.println("주문 된 메뉴");
                break;
            }


        }
    }
}