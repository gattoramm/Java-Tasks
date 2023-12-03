package courses.hackerrank.string.anagram;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    static String sort(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        char temp;

        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }

        StringBuffer s = new StringBuffer();
        for (char c : arr)
            s.append(c);

        return String.valueOf(s);
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        return sort(a).equals(sort(b));
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        boolean ret = isAnagram(a, b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//        System.out.println(Arrays.asList("Cat".toLowerCase()).stream().sorted().toString());
//        System.out.println(Arrays.asList("AcT".toLowerCase()).stream().sorted().toString());
        System.out.println(isAnagram("Cat", "AcT"));
       //System.out.println(Arrays.sort(Arrays.toString("AcT".toLowerCase().toCharArray()).toCharArray()));
//        System.out.println(hash("Cat".toLowerCase()));
//        System.out.println(hash("AcT".toLowerCase()));
//        System.out.println(hash("tac".toLowerCase()));
    }
}
