package campus.exam;

import java.util.HashSet;

public class HashSetMain {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(100);
        set.add(50);
        set.add(100);
        set.add(5);

        int result = 0;
        for(Integer li : set) {
            result+=li;
        }

        System.out.println(result);
    }
}
