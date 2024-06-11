package campus.ch06;

public class SwitchCase {

    public static void main(String[] args) {

        int num = 100%4;
        System.out.println("num: "+num);

        switch(num) {
            case 1:
                System.out.println("나머지는 1이다.");
                break;
            case 2:
                System.out.println("나머지는 2이다.");
                break;
            case 3:
                System.out.println("나머지는 3이다.");
                break;
            default:
                System.out.println("나머지는 0이다.");
        }


        switch(1) {
            default:
                System.out.println("test");
                break;
            case 1:
                System.out.println("나머지는 1이다.");
                break;
            case 2:
                System.out.println("나머지는 2이다.");
                break;
            case 3:
                System.out.println("나머지는 3이다.");
        }


        num = 49%4;
        switch (num) {
            case 1: case 3:
                System.out.println("나머지의 값은 홀수이다.");
                break;
            default:
                System.out.println("나멎지의 값은 짝수이다.");
        }
    }
}
