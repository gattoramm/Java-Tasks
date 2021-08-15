package part5.Initialization.Ex_21_22Enums;

public class Ex_21EnumsValOrd {
    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
        }
    }
}
