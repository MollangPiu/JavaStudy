package campus.test;

public class ForMain {

    public static void main(String[] args) {
        //1
        for(int i =0; i < 100; i++) {
            if(i%2 == 0 && i %5 != 0) {
                System.out.println(i);
            }
        }
        //2
        for(int i=0; i< 100; i++) {
            if(i%2==0) {
                if(i%5 ==0) {
                    continue;
                }
                System.out.println(i);
            }
        }

        //3
        for(int i=0; i< 100; i+=2) {
            if(i%5 ==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
