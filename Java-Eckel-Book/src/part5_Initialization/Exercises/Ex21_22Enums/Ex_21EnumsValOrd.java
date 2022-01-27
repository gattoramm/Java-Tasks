package part5_Initialization.Exercises.Ex21_22Enums;

public class Ex_21EnumsValOrd {
    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
        }
    }
}
