package JavaPropl;

import java.util.Scanner;

public class Ex01_03 {

    /**
     * 정돈된 수
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum;
        do {
            System.out.println("시작값 입력(100이상)");
            startNum = sc.nextInt();    //시작
        } while (startNum < 100);
        int endNum; //종료 값
        do {
            System.out.println("종료값 입력(9,999,999이하)");
            endNum = sc.nextInt();      //종료
        } while (startNum >= endNum || endNum > 9999999);
        System.out.println("입력 완료");

        int systemCnt = 0;
        for (int num = startNum; num < endNum; num++) {

            /**
             * method 이용
             * return boolean(정돈된 수 true)
             */
            if (checkNum(String.valueOf(num))) {

                /**
                 * 10줄마다 개행 시키기
                 */
                if (systemCnt == 10) {
                    System.out.println("");
                    systemCnt -= 10;
                }
                /**
                 * 결과값 출력
                 */
                System.out.printf("%d ", num);

                /**
                 * 개행 하기 위한 카운트
                 */
                systemCnt++;
            }

        }
    }

    /**
     * 정돈된 값인지 확인하기 뒷자리로 갈수록 커지는 값
     *
     * @param num
     * @return
     */
    static boolean checkNum(String num) {
        /**
         * return 기본값 true;
         */
        boolean check = true;

        /**
         * 비교를 쉽게 하기 위해서 숫자를 char의 배열로 변형
         */
        char[] arr = num.toCharArray();
        /**
         * 이전값에 대한 값을 저장한다.
         */
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            } else {
                check = false;
            }
        }


        return check;
    }
}
