package campus.ch09;

public class TwoArrayCreate {

    //다차원 배열
    public static void main(String[] args) {

        //다차원 배열 생성
        String[][] cafeMenu = {
                {"아메리카노", "카페라떼", "바닐라라떼"},
                {"복숭아 아이스티", "레몬 에이드", "밀크쉐이크"},
                {"치즈케이크", "초코케이크", "딸기케이크"}
        };

        //다차원배열일 경우, 배열의 차원만큼 반복문이 증가된다.
        //3이라는 숫자는 각각 3행, 3열을 만들었기 때문에 정의
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println(cafeMenu[i][j]);
            }
        }
        System.out.println("===================== array Check");

        String [] testArr1 = new String[3];     //열
        String [][] testArr2 = new String[3][2]; //행 열
        String [][][] testArr3 = new String[2][3][2];   //면 행 열


        System.out.println("===================== for length");

        /**
         * 배열의 크기를 알기란 어렵다.
         * 배열의 크기를 모를 경우, length를 이용해야 한다.
         * length를 이용할 때, for문의 안쪽을 사용할 수록 주의 해야 한다.
          **/
        for(int i = 0; i < cafeMenu.length; i++) {
            for(int j = 0; j < cafeMenu[i].length; j++) {
                System.out.println(cafeMenu[i][j]);
            }
        }

        System.out.println("======================= cafe menu");
        String[][] cafeMenu02 = {
                {"아메리카노", "카페라떼", "바닐라라떼", "초코라떼"},
                {"복숭아 아이스티", "레몬 에이드", "밀크쉐이크", "민트초코", "딸기 요거트"},
                {"치즈케이크", "초코케이크", "딸기케이크"}
        };

        //예제처럼, 각 행마다 열의 크기가 다를 수도 있기 때문
        for(int i = 0; i < cafeMenu02.length; i++) {
            for(int j = 0; j < cafeMenu02[i].length; j++) {
                System.out.println(cafeMenu02[i][j]);
            }
        }


    }
}
