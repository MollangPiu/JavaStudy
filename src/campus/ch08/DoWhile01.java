package campus.ch08;

public class DoWhile01 {

    public static void main(String[] args) {

        /**
         * while과 비슷하다.
         * while과 다르게, 처음 한 번은 무조건 실행 된다.
         */
        int num = 0;
        do {

            System.out.println("num: "+num);
            num++;
        }
        while(num < 10);

    }
}
