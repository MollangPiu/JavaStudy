package campus.exam.level1;

public class 공배수 {

    public static void main(String[] args) {
        공배수 pro = new 공배수();
        pro.solution(60, 2, 3);
    }

    public int solution(int number, int n, int m) {
        return (number%n ==0 && number%m ==0 ? 1 : 0);
    }
}
