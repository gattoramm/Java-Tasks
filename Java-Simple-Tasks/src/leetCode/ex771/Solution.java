package leetCode.ex771;

class Solution {
    public static int numJewelsInStones1(String jewels, String stones) {
        String[] jewelsArray = jewels.split("");
        String[] stonesArray = stones.split("");
        int count = 0;
        for (String s : stonesArray) {
            for (String j : jewelsArray) {
                if (s.equals(j))
                    count++;
            }
        }
        return count;
        /*
            Runtime: 11 ms, faster than 7.19% of Java online submissions for Jewels and Stones.
            Memory Usage: 43.4 MB, less than 6.50% of Java online submissions for Jewels and Stones.
        */
    }

    public static int numJewelsInStones2(String jewels, String stones) {
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        for (char c : stonesArray) {

        }

        int count = 0;
        for (char s : stonesArray) {
            for (char j : jewelsArray) {
                if (s == j)
                    count++;
            }
        }
        return count;

        /*
            Runtime: 1 ms, faster than 98.04% of Java online submissions for Jewels and Stones.
            Memory Usage: 42.3 MB, less than 63.71% of Java online submissions for Jewels and Stones.
        */
    }

    public static int numJewelsInStones3(String jewels, String stones) {
        byte[] jewelsArray = jewels.getBytes();
        byte[] stonesArray = stones.getBytes();
        int count = 0;
        for (byte s : stonesArray) {
            for (byte j : jewelsArray) {
                if (s == j)
                    count++;
            }
        }
        return count;

        /*
            Runtime: 1 ms, faster than 98.04% of Java online submissions for Jewels and Stones.
            Memory Usage: 42.5 MB, less than 46.34% of Java online submissions for Jewels and Stones.
        */
    }

    public static int numJewelsInStones4(String jewels, String stones) {
        int count = 0;
        for (byte s : stones.getBytes()) {
            for (byte j : jewels.getBytes()) {
                if (s == j)
                    count++;
            }
        }
        return count;

        /*
            Runtime: 1 ms, faster than 98.04% of Java online submissions for Jewels and Stones.
            Memory Usage: 42.5 MB, less than 46.34% of Java online submissions for Jewels and Stones.
        */
    }

    public static void main(String[] arg) {
//        System.out.println(numJewelsInStones2("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones4("aA", "aAAbbbb"));
    }
}
