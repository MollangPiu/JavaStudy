package campus.exam;

public class UclidExMain {

    public static int findNumber(int numA, int numB) {
        if (numB == 0) {
            return numA;
        }

        return findNumber(numB, numA % numB );
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 72;
        System.out.println(findNumber(num1, num2));
    }
}
