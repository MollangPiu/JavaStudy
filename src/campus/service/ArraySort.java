package campus.service;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 네개의 정수를 입력 받아서 순서대로 만들기
 * 0은 맨 앞에 나올 수 없다.
 */
public class ArraySort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력을 받는다.
        int[] inputArr = new int[4];
        int inputNum = scanner.nextInt();
        inputArr[0] = inputNum / 1000;
        inputArr[1] = (inputNum % 1000) / 100;
        inputArr[2] = (inputNum % 100) / 10;
        inputArr[3] = inputNum % 10;

        //입력 받은 값을 정렬 ( 오름 차순)
        Arrays.sort(inputArr);
        for(int i =0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);
        }

        System.out.println("=================");
        int zeroindex = 0;  //현재 0의 갯수 체크

        // 0의 갯수 파악 ( 앞의 정렬로 0이 제일 앞으로 감 )
        for(zeroindex=0; zeroindex < inputArr.length; zeroindex++) {
            
            //0이 아니면 반복문 중지
            if(inputArr[zeroindex] != 0) {
                break;
            }
        }

        //0의 위치와 0이 아닌 위치를 변경
        if(zeroindex != 0) {
            inputArr[0] = inputArr[zeroindex];
            inputArr[zeroindex] = 0;
        }


        //배열 출력
        for(int li : inputArr) {
            System.out.println(li);
        }
    }
}
