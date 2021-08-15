package Wrapper.task1;

public class wrapper1 {

    public static void main(String[] args) {
        //примитивы передаются по значению, объекты - по ссылке
        Integer i = new Integer(555);
        Double d = new Double(2.22);
        Boolean b = new Boolean(true);
        Character c = new Character('s');

        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
        System.out.println("Character: " + c);
    }
}
