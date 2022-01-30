package Strings;

public class fuzzbuzz {
    public static void bingoBongo(int num){
        StringBuffer result = new StringBuffer("");
        if (num%3 == 0) result.append("Bingo");
        if (num%5 == 0) result.append("Bongo");
        if (num%5 != 0 && num%3 != 0) result.append(num);
        System.out.println(result);
    }
    public static void main(String[] args) {
        for (int i=1; i<101; i++)
            fuzzbuzz.bingoBongo(i);
    }
}
