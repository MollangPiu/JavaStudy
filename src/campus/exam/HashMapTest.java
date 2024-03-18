package campus.exam;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> map;
        map = new HashMap<>();
        map.put("window", "CAMERA");
        map.put("linux", "BANANA");
        map.put("os", "CAMERA");

        int result = 0;
        for (int i = 0; i < map.entrySet().size(); i++) {
            result += i * 100;
        }
        System.out.println(result);
    }
}
