package campus.exam;

public class ArrayIndexMain {

    public static void main(String[] args) {
        
        try {
            int[] arr = new int[3];

            for(int i=0; i < 5; i++) {
                arr[i]=i*100;
                System.out.println(arr[i]);
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR 발생");
        }
    }
}
