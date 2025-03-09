package campus.pro.반복문;

public class DoWhileCreate {

    public static void main(String[] args) {

        int cnt = 0;
        //애는 while과 비슷하지만, 무조건 한 번은 시작하고 본다.
        do {
            System.out.println("실행 확인하기");
        } while(false);

        
        //do While
        do {
            System.out.println("cnt: "+cnt++);
        } while(cnt < 10);


        System.out.println("=================================");
        //Quiz
        //입력받은 값으로 do while 활용하여 곱하기 만들기

    }
}
