public aspect GreetingAspect {

    pointcut greeting() : execution(* Main.printname)
}