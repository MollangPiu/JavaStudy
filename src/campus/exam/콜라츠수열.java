package campus.exam;

public class 콜라츠수열 {

    public static void main(String[] args) {
        콜라츠수열 pro = new 콜라츠수열();
        pro.solution(10);
    }

    public int[] solution(int n) {
        System.out.println("시작");
        int[] answer = {};
        int i=0;
        int num = n;
        for( ;num != 1; i++) {
            System.out.println("n: "+num);
            if(num%2==0) {
                num/=2;
            }
            else {
                num = (num*3)+1;
            }
        }
        System.out.println("i: "+i);
        int [] arr = new int[i+1];
        arr[0] = n;
        for(i=1 ;n != 1; i++) {
            if(n%2==0) {
                n/=2;
            }
            else {
                n = (n*3)+1;
            }
            arr[i] = n;
        }

        return arr;
    }
}
