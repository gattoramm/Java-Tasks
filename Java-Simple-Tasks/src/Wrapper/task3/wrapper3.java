package Wrapper.task3;

import java.util.Arrays;

public class wrapper3 {
    public static void main(String[] args) {
        int x = 7;
        Integer y = 888;
        x = y; //автоупаковка autoboxing
        y = x * 123;//автораспаковка autounboxing

        //авотупаковка и распаковка не работает для массивов
        int[] i = {1, 2, 3, 4};

        //printArray(i);
    }

    public static void printArray(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
