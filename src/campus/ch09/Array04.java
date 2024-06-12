package campus.ch09;

/**
 * 다중 배열
 */
public class Array04 {

    public static void main(String[] args) {
        int [][] arr = new int[2][3];


        for(int i=0, cnt = 10; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++, cnt+=10) {
                arr[i][j] = cnt;
            }
        }

        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

}
