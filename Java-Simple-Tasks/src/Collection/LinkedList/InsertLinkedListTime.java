package Collection.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class InsertLinkedListTime {

    public static void main(String[] arg) {

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }

        System.out.println(" Время работы LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));

    }

}
