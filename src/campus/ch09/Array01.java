package campus.ch09;

class Array01 {

    public static void main(String[] args) {
        //배열을 사용하기 전.
        String cafeMenu01 = "아메리카노";
        String cafeMenu02 = "카페라떼";
        String cafeMenu03 = "복숭아 아이스티";

        System.out.println(cafeMenu01);
        System.out.println(cafeMenu02);
        System.out.println(cafeMenu03);



        //크기를 3으로 지정했다. 공간은 0, 1, 2가 할당된다.
        String[] cafeMenu = new String[3];
        cafeMenu[0] = "아메리카노";
        cafeMenu[1] = "카페라떼";
        cafeMenu[2] = "복숭아 아이스티";

        System.out.println(cafeMenu[0]);
        System.out.println(cafeMenu[1]);
        System.out.println(cafeMenu[2]);


        //String[] cafeMenu = {"아메리카노", "카페라떼", "복숭아 아이스티"};


    }

}
