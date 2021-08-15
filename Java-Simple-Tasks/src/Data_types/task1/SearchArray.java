package Data_types.task1;

public class SearchArray {
    public static void main(String[] args) {
        int[] arraySmall = {119, 20, 26, 480, 55, 34, 75, 1, 0};
        printMaximumElement(arraySmall);
    }

    private static void printMaximumElement(int[] array) {
        int max = 0;
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}
