package Collection.LinkedList;

import java.util.Date;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class InserStartLinkedListTime {

    public static void main(String[] arg) {
        getTimeMsOfInsert(new ArrayList());
        getTimeMsOfInsert(new LinkedList());
    }

    private static void getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insert1000000(list);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();

        System.out.println("Результат в миллисекундах: " + msDelay);
    }

    private static void insert1000000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }

}
