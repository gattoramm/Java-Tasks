package part2.Ex9_PrimaryType;

public class Ex9 {
    public static void main(String[] args) {
        Character ch = new Character('s');
        Integer num = new Integer(32);
        Double db = new Double(32.6d);
        Short shrt = new Short((short) 15);
        Byte bt = new Byte((byte) 7);
        Long lng = new Long(10000000l);
        Float flt = new Float(31.5f);

        System.out.println("Charachter: " + ch);
        System.out.println("Integer: " + num);
        System.out.println("Double: " + db);
        System.out.println("Short: " + shrt);
        System.out.println("Byte: " + bt);
        System.out.println("Long: " + lng);
        System.out.println("Float: " + flt);
    }
}
