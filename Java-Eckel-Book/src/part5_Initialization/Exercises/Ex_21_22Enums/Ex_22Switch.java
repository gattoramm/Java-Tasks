package part5_Initialization.Exercises.Ex_21_22Enums;

public class Ex_22Switch {
    Money money;
    public Ex_22Switch(Money money) {
        this.money = money;
    }
    public void describe() {
        System.out.print("This money is ");
        switch(money) {
            case RUBBLE:
                System.out.println("Rubble");
                break;
            case YEN:
            case EURO:
                System.out.println("Euro");
                break;
            case PESO:
            case POUND:
            case DOLLAR:
                System.out.println("Dollar");
                break;
        }
    }

    public static void main(String[] args) {
        new Ex_22Switch(Money.DOLLAR).describe();
        new Ex_22Switch(Money.RUBBLE).describe();
        new Ex_22Switch(Money.EURO).describe();
    }
}
