package campus.exam;


import java.util.HashMap;

public class ExMapMain {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("obj", "A");
        map.put("obj", "B");
        map.put("abc", "C");

        int result = 0;
        for(int i=0; i < map.entrySet().size(); i++) {
            result+=i*500;
        }
        System.out.println(result);
    }
}
