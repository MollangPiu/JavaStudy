package campus.exam.level1;

public class 두개주사위 {

    public static void main(String[] args) {

        두개주사위 pro = new 두개주사위();
//        System.out.println(pro.solution(3, 5));

        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(9));

    }

    public int solution(int a, int b) {
        int answer = 0;
        if(a%2!=0 && b%2!=0) {
            answer = (int)(Math.pow(a,2) + Math.pow(b,2));
        } else if(a%2 != 0 || b%2 != 0) {
            answer = 2*(a+b);
        } else {
            answer = Math.abs(a-b);
        }
        return answer;
    }
}
