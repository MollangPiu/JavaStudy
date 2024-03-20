package campus.service;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 반복된 수, 같은 수 반복 체크하기
 *
 */
public class BabyGin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numArr = new int[6];

        int [] numCheck = new int[10];
        for(int i = 0; i < numCheck.length; i++) {
            numCheck[i] = 0;
        }

        System.out.println("수 입력해주세요");
        int inputNum = scanner.nextInt();

        numArr[0] = inputNum/100000;
        inputNum%=100000;
        numArr[1] = inputNum/10000;
        inputNum%=10000;
        numArr[2] = inputNum/1000;
        inputNum%=1000;
        numArr[3] = inputNum/100;
        inputNum%=100;
        numArr[4] = inputNum/10;
        numArr[5] = inputNum%10;

        
        //각 숫자가 몇 개씩 있는지 확인하기
        for(int i = 0; i < numArr.length; i++) {
            numCheck[numArr[i]]++;
        }


        System.out.println("========");

        for(int i = 0; i < numCheck.length; i++) {
            if(numCheck[i] == 0) {
                continue;
            }

            if(numCheck[i] >= 3) {
                numCheck[i]-=3;
            }

            if(numCheck[i] >= 1 && numCheck[i+1] >= 1 && numCheck[i+2] >= 1 && i < numCheck.length-2) {
                numCheck[i]--;
                numCheck[i+1]--;
                numCheck[i+2]--;

                i--;
            }
        }

        //BabyGinCheck
        int sumResult = 0;
        for(int i = 0; i < numCheck.length; i++) {
            System.out.println(i+": "+numCheck[i]);
            sumResult += numCheck[i];
        }

        if(sumResult == 0) {
            System.out.println("Baby Gin!!");
        } else {
            System.out.println("Lose");
        }
    }
}
