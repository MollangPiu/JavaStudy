package JavaPropl;

import java.util.Arrays;

public class Ex01_01 {

    public static void main(String[] args) {
        int cnt = (int)(Math.random()*9000)+1000;

        System.out.println(cnt);

        String str = String.valueOf(cnt);
        char [] arr = str.toCharArray();

        Arrays.sort(arr);
        for(int i = 0; i < arr.length;) {
            if(arr[i] == '0') {
                for(int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = '0';
            }
            else {
                break;
            }
        }

        System.out.println(arr);

    }
}
