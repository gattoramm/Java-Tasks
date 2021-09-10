package Numeric.octal;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.toOctalString;

public class octalIncrement {
    public static void main(String[] args) {

        // нижняя граница 2(8) слово включительно
        // верхняя граница 240(8) слово включительно
        // нужны слова с 2(8) по 240(8) через одно

        List<Integer> list = new ArrayList();
        int num = 0;
        int border = Integer.parseInt(String.valueOf(241), 8);
        for(int i = 2; (num + i) < border; i+=2) {
            list.add(num+i);
        }
        int count = 0;
        System.out.println("№  - oct - dec");
        for(int i:list) {
            count++;
            System.out.println(count + " - " + toOctalString(i) + " - " + i);
        }

        System.out.println(list.size());
    }
}
