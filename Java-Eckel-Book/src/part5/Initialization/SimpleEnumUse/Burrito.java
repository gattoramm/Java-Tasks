package part5.Initialization.SimpleEnumUse;

public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
            plain = new Burrito(Spiciness.NOT),
            grrenChilie = new Burrito(Spiciness.MEDIUM),
            japanello = new Burrito(Spiciness.HOT);
        plain.describe();
        grrenChilie.describe();
        japanello.describe();
    }
}
