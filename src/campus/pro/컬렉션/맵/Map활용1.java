package campus.pro.컬렉션.맵;

import java.util.HashMap;
import java.util.Map;

public class Map활용1 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "홍길동");
        map.put("2", "슈퍼맨");

        System.out.println(map.get("1"));
    }
}
