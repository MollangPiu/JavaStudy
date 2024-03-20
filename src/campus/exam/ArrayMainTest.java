package campus.exam;

public class ArrayMainTest {

    public static void main(String[] args) {
        int [][] arr;
        arr = new int[2][];
        arr[0] = new int[5];
        arr[1] = new int[3];

        System.out.println(arr.length);
        System.out.println(arr[1].length);
    }
}
