package campus.exam;

import java.awt.*;

public class IfTest {

    public static void main(String[] args) {

        boolean check = true;
        int num = 3000;

        if(check) {
            num += 1000;
        } else {
            num += 500;
        }

        System.out.println(num);
    }
}
