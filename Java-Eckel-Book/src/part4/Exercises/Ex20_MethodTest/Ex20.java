package part4.Exercises.Ex20_MethodTest;

// Измените метод test, чтобы он получал два дополнительных аргумента begin и end,
// а значение testval проверялось на принадлежность к диапазону [begin, end]
// (с включением границ)

public class Ex20 {
    static boolean test(int target, int begin, int end) {
        /*if (target >= begin && target <= end)
            return true;
        return false;*/
        return (target >= begin) && (target <= end) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println("34 in [23, 56]: " + test(34,23,56));
        System.out.println("-34 in [23, 56]: " + test(-34,23,56));
        System.out.println("23 in [23, 56]: " + test(23,23,56));
        System.out.println("56 in [23, 56]: " + test(56,23,56));
    }
}
