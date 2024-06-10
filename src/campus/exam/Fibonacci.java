package campus.exam;

public class Fibonacci {
    // 피보나치 수열의 n번째 항을 계산하는 재귀 함수
    public static int fiboRec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fiboRec(n - 1) + fiboRec(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // 계산하고 싶은 피보나치 수열의 항
        for (int i = 0; i < n; i++) {
            System.out.print(fiboRec(i) + " ");
        }
    }
}