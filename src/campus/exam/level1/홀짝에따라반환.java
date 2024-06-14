package campus.exam.level1;

public class 홀짝에따라반환 {

    public static void main(String[] args) {
        홀짝에따라반환 pro = new 홀짝에따라반환();
        System.out.println(pro.solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        int check = n%2;
        for(int i= check; i <= n; i+=2) {
            switch(check) {
                case 1:
                    answer += i;
                    break;
                case 0:
                    answer += (i*i);
                    break;
            }
        }
        return answer;
    }
}
