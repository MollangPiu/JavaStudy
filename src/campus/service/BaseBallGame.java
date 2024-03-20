package campus.service;

import java.util.Scanner;

public class BaseBallGame {



    public static void main(String[] args) {

        int strikeCount = 0;
        int ballCount = 0;

        Scanner scanner = new Scanner(System.in);
        //야구게임에 필요한 정수 3개 구하기 ( 중복 x )
        int[] arr = BaseBallGame.baseBallCnt();
        int[] inputArr = new int[3];


        while (strikeCount < 3) {
            strikeCount = 0;
            ballCount = 0;

            System.out.println("세개의 숫자를 입력해주세요.");
            int inputNum = scanner.nextInt() % 1000;
            inputArr[0] = inputNum / 100;
            inputArr[1] = (inputNum % 100) / 10;
            inputArr[2] = inputNum % 10;

            for (int i = 0; i < arr.length; i++) {

                //두수 비교하기 - strike
                strikeCount += BaseBallGame.numCheck(arr[i], inputArr[i]);

                //ball 비교하기
                for (int j = 0; j < arr.length; j++) {

                    //ball의 규칙 - 같은 index를 제외한 같은 값
                    if (i != j) {

                        //두수 비교하기 - ball
                        ballCount+= BaseBallGame.numCheck(arr[i], inputArr[j]);

                    }
                }
            }
            System.out.println("ball: " + ballCount);
            System.out.println("strkie: " + strikeCount);
            System.out.println("out: " + (3 - (ballCount + strikeCount)));
        }

        System.out.println("게임이 완료 되었습니다.");

    }

    //야구게임 난수 3개 구하기
    public static int[] baseBallCnt() {
        int[] baseArray = new int[3];
        int index = 0;
        //3개의 난수 구하기
        while (index < 3) {
            boolean check = true;   //중복값 체크하기
            int randomNum = (int) (Math.random() * 10);    //랜덤값 구하기 0 - 9
            for (int i = 0; i < index && check; i++) {     //중복값 체크하기
                if (baseArray[i] == randomNum) {        //중복값 찾기 + 중복값 찾을 경우 반복문 break;
                    check = false;
                }
            }

            //중복값 없을 경우 배열에 값 넣기
            if (check) {
                baseArray[index++] = randomNum;
            }
        }
        return baseArray;
    }

    
    //두 수 비교 하기
    public static int numCheck(int firstNum, int secondNum) {
        if (firstNum == secondNum) {
            return 1;
        } else {
            return 0;
        }
    }

}
