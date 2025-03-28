package campus.pro.컬렉션.셋;

import java.util.HashSet;
import java.util.Set;

public class Set활용2 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");

        for(String str : set) {
            System.out.println(str);
        }

    }
}
