package campus.test;

public class SecondTable {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        solution(arr);
    }

    public static String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < numLog.length - 1; i++) {
            answer += resultStr(numLog[i], numLog[i + 1]);
        }

        System.out.println(answer);
        return answer;
    }

    public static String resultStr(int firstNum, int secondNum) {
        String str = "";
        int result = secondNum - firstNum;

        while (result >= 10) {
            str += "d";
            firstNum += 10;
            result = secondNum - firstNum;
        }
        while (result <= -10) {
            str += "a";
            firstNum -= 10;
            result = secondNum - firstNum;
        }
        while (result > 0) {
            str += "w";
            firstNum += 1;
            result = secondNum - firstNum;
        }
        while (result < 0) {
            str += "s";
            firstNum -= 1;
            result = secondNum - firstNum;
        }

        return str;
    }
}