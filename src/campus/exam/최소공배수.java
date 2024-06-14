package campus.exam;

public class 최소공배수 {

    public static void main(String[] args) {
        최소공배수 sub = new 최소공배수();
        int [] arr = {2, 6, 8, 14};
        sub.solution(arr);
        System.out.println(sub.gcd(10, 9));
    }

    public int solution(int[] arr) {
        System.out.println("도착");
        int answer = arr[0];

        int first = arr[0];

        for(int i=1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        System.out.println(answer);
        return answer;
    }


    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        return (a*b) / gcd(a, b);
    }
}


