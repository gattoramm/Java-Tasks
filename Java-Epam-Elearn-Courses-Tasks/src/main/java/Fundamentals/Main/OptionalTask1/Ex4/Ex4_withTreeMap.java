package Fundamentals.Main.OptionalTask1.Ex4;

import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Ввести n чисел с консоли.
 * Найти число, в котором количество различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */

public class Ex4_withTreeMap {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество чисел: ");
//        int count= scanner.nextInt();
//
//        int[] values = new int[count];
//        for (int i = 0; i < count; i++)
//            values[i] = scanner.nextInt();

        long[] values = new long[]{1224532456236315L, 857436362345L, 223456435356457879L, 22145523623415L};
        

        int minValueRetrySymbs = Integer.MAX_VALUE;

//        TreeMap<String, Integer> mapInputString = new TreeMap<>();
//
//        for (String arg : args)
//            mapInputString.put(arg, 1);
//
//        for (Map.Entry<String, Integer> item : mapInputString.entrySet()) {
//            int maxRetryOfCurrentString = 0;
//
//            String currElem = item.getKey();
//            char[] chStr = currElem.toCharArray();
//
//            TreeMap<Character, Integer> mapOfFreqChars = new TreeMap<>();
//
//            for (char chr : chStr) {
//                if (!mapOfFreqChars.containsKey(chr))
//                    mapOfFreqChars.put(chr, 1);
//                else
//                    mapOfFreqChars.put(chr, mapOfFreqChars.get(chr) + 1);
//
//                if (mapOfFreqChars.get(chr) > maxRetryOfCurrentString)
//                    maxRetryOfCurrentString = mapOfFreqChars.get(chr);
//            }
//            mapInputString.put(currElem, maxRetryOfCurrentString);
//
//            if (maxRetryOfCurrentString < minValueRetrySymbs)
//                minValueRetrySymbs = maxRetryOfCurrentString;
//        }
//
//        for (Map.Entry<String, Integer> item : mapInputString.entrySet()) {
//            if (item.getValue()  == minValueRetrySymbs) {
//                System.out.println(item.getKey());
//                return;
//            }
//        }
    }
}
