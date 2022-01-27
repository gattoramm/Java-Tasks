package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class InsertArrayListTime {

    public static void main(String[] arg) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, Integer.MAX_VALUE);
        }

        System.out.println(" Время работы ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));

    }

}
