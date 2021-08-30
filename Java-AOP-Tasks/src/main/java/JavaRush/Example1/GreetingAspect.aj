package JavaRush.Example1;

public aspect GreetingAspect {

    pointcut greeting() : execution(* Main.printName(..));

    before() : greeting() {
        System.out.print("Hello ");
    }
}