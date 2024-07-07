package campus.service;

import java.util.Scanner;

/**
 * 두 개의 수를 받아서 숫자 정돈하기
 * 
 * 두 개의 수를 입력 받는다.
 * 첫 번째 수부터 두번째 수를 입력 받는다.
 * 
 * 첫 번째의 수에서 두 번째 수까지 진행 되는 동안
 * 앞자리보다 뒷 자리가 더 클 경우에만 표기 된다.
 * 123 ok / 122 no / 431 no
 * 
 * 세자리 수 까지만 비교 하도록 해보자.
 * 
 * 
 */
public class TwoNumSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수");
        int firstNum = scanner.nextInt();

        if (TwoNumSort.checkInputNum(firstNum)) {
            return;
        }

        System.out.println("두 번째 수");
        int secondNum = scanner.nextInt();

        if (TwoNumSort.checkInputNum(secondNum)) {
            return;
        }


        int searchCount = 0;    //개행 비교

        //첫 번째 입력값에서 두번째 입력값 까지 반복
        for (; firstNum < secondNum; firstNum++) {

            boolean check = true;
            String firstStr = Integer.toString(firstNum);   //현재 비교되는 수를 String으로 변형 ( 각 자리 수 마다 비교 하기 위해서 )

            check = TwoNumSort.sortNum(firstStr);       //정돈된 수 비교하기

            // print 출력 ( console 창 이쁘게 출력 )
            if (check) {
                System.out.printf(firstNum + "\t\t");

                if (++searchCount % 7 == 0) {
                    System.out.println();
                }
            }

        }
    }  // main End


    /**
     * 유효성 검사
     *
     * @param num
     * @return true: 유효성 검사 실패
     * false: 유효성 검사 합격
     */
    public static boolean checkInputNum(int num) {
        if (100 > num || num > 9999999) {
            System.out.println("잘못 된 입력 값 입니다.");
            System.out.println("범위는 100부터 9,999,999 입니다.");
            return true;
        }
        return false;
    }


    /**
     * 현재의 숫자가 정돈 된 수 인지 파악하기
     *
     * @param inputNumStr 비교할 숫자 대상
     * @return boolean
     * true: 정돈된 수
     * false: 불일치
     */
    public static boolean sortNum(String inputNumStr) {
        boolean breakCheck = true;  //현재 입력 된 숫자가 정렬 된 숫자인지 파악하기

        //현재의 숫자 - 앞 순서부터 반복문
        for (int i = 0; i < inputNumStr.length() && breakCheck; i++) {

            //현재의 숫자 - 맨 앞을 제외한 앞 자리 순서부터 반복문
            for (int j = i + 1; j < inputNumStr.length() && breakCheck; j++) {
                float firstChr = inputNumStr.charAt(i); //첫 번째 자리 반복문
                float secondChr = inputNumStr.charAt(j); // 두 번째 자리 담기

                //첫 번째 자리수가 두번째 자리보다 크거나 같을 경우 ( float은 아스키 코드로 비교 )
                if (firstChr >= secondChr) {
                    breakCheck = false; //만약 if의 조건이 해당된다면, for가 동작 멈추기 위한 변수
                }
            }
        }

        return breakCheck;  //유효성 모두 통과 되면 값 반환
    }
}
