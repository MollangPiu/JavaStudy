package campus.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutSreamA {

    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:\\test\\test.txt");

            byte a = 15;
            byte b = 25;
            byte c = 35;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
