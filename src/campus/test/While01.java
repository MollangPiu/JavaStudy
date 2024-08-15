package campus.test;

public class While01 {

    public static void main(String[] args) {

        int num = 0;
        System.out.println(num++);
        System.out.println(++num);
        num = 0;

        num += 5; // num = num+5;
        num += 10;// num = num+10; num = 5+10;
        System.out.println(num);


        int sum =0;
        int i =0;
        while (sum<= 100) {
            System.out.printf("%d - %d%n", i, sum);
            i++;
            sum+= i;
        }
    }
}
