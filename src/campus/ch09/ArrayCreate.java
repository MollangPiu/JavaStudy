package campus.ch09;

public class ArrayCreate {

    //배열 만들기
    public static void main(String[] args) {

        //배열을 사용하기 전.
        String cafeMenu01 = "아메리카노";
        String cafeMenu02 = "카페라떼";
        String cafeMenu03 = "복숭아 아이스티";

        System.out.println(cafeMenu01);
        System.out.println(cafeMenu02);
        System.out.println(cafeMenu03);

        System.out.println("=====================================");

        //크기를 3으로 지정했다. 공간은 0, 1, 2가 할당된다.
        String[] cafeMenu = new String[3];
        cafeMenu[0] = "아메리카노";
        cafeMenu[1] = "카페라떼";
        cafeMenu[2] = "복숭아 아이스티";

        System.out.println(cafeMenu[0]);
        System.out.println(cafeMenu[1]);
        System.out.println(cafeMenu[2]);

        System.out.println("=============================== tomCafe");
        String[] tomCafeMenu = {"아메리카노", "카페라떼", "바닐라라떼", "복숭아 아이스티"};
        System.out.println(tomCafeMenu[0]);
        System.out.println(tomCafeMenu[1]);
        System.out.println(tomCafeMenu[2]);
        System.out.println(tomCafeMenu[3]);

        System.out.println("================================= menuWait");
        int[] menuWait = new int[3];
        menuWait[0] = 10;
        menuWait[1] = 59;
        menuWait[2] = 50;

        System.out.println(menuWait[0]);
        System.out.println(menuWait[1]);
        System.out.println(menuWait[2]);
        System.out.println("================================ menuWait02");
        int[] menuWaitGo = {100, 85, 50};
        System.out.println(menuWaitGo[0]);
        System.out.println(menuWaitGo[1]);
        System.out.println(menuWaitGo[2]);
    }
}
