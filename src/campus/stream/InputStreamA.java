package campus.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamA {

    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("C:\\test\\test.txt");

        byte[] buffer = new byte[100];

        while(true) {
            int readByteNum = is.read(buffer);
            if(readByteNum == 1) break;
            for(int i=0; i < readByteNum; i++) {
                System.out.println(buffer[i]);
            }
        }
    }
}
