package campus.ch09;

public class Array03 {


    /**
     * 반복문 사용해서 배열 출력하기
     * @param args
     */
    public static void main(String[] args) {

        //크기를 3으로 지정했다. 공간은 0, 1, 2가 할당된다.
        String[] cafeMenu = new String[3];
        cafeMenu[0] = "아메리카노";
        cafeMenu[1] = "카페라떼";
        cafeMenu[2] = "복숭아 아이스티";

        System.out.println(cafeMenu[0]);
        System.out.println(cafeMenu[1]);
        System.out.println(cafeMenu[2]);

        //반복문을 사용해서 출력을 해보시오.
        for(int i=0; i < cafeMenu.length; i++) {
            System.out.println(cafeMenu[i]);
        }

        int cnt = 0;
        while(cnt < cafeMenu.length) {
            System.out.println(cafeMenu[cnt]);
            cnt++;
        }
    }
}
