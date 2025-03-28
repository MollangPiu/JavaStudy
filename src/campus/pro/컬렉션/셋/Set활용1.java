package campus.pro.컬렉션.셋;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set활용1 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println("=======================");
        set.add("9");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=========================");
        iterator = set.iterator();
        int cnt = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if(cnt == 2) {
                iterator.remove();
            }
            cnt++;
        }

        System.out.println("=======================");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
