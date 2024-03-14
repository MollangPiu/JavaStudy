package campus.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DefaultRefence {

    public static void main(String [] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("짱구");
        list.add("철수");
        list.add("유리");
        list.add("짱구");

        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("짱구");
        set.add("철수");
        set.add("유리");
        set.add("철수");

        System.out.println(set);

        HashMap<String, String> map = new HashMap<>();
        map.put("짱구", "초코비");
        map.put("철수", "공책");
        map.put("유리", "인형");

        System.out.println(map.get("짱구"));
    }
}
