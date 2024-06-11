package campus.ch09;

public class ArrayForCreate {

    public static void main(String[] args) {

        //배열은 한 번에 저장한다는 장점이 있지만, 사용하기가 불편하다.?
        String[] tomCafeMenu = {"아메리카노", "카페라떼", "바닐라라떼", "복숭아 아이스티"};
        System.out.println(tomCafeMenu[0]);
        System.out.println(tomCafeMenu[1]);
        System.out.println(tomCafeMenu[2]);
        System.out.println(tomCafeMenu[3]);

        System.out.println("====================== use  for");
        //tomCafeMenu는 4개가 담겨 있으므로.
        for(int i = 0; i < 4; i++) {
            System.out.println(tomCafeMenu[i]);
        }

        System.out.println("====================== use for length");
        for(int i = 0; i <tomCafeMenu.length; i++) {
            System.out.println(tomCafeMenu[i]);
        }

        System.out.println("====================== use for length");
        String [] arrTest = new String[5];
        System.out.println(arrTest.length);

    }
}
