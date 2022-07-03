package lambda.Java8Lambdas.part2;

public class CheckFinalParam {
    public static void main(String[] args) {
        String name = getUserName();
        //name = formatUserName(name);
        GetEvent event = () -> {
            System.out.println("hi " + name);
        };
    }

    private static String formatUserName(String name) {
        return name.toUpperCase();
    }

    private static String getUserName() {
        return "Anna";
    }
}

interface GetEvent {
    void func();
}