package part5.Initialization.StaticInitialization;

// Указание значений по умолчанию в определении класса

class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        System.out.println("\tTable()");
    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("\t\tCupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

    public static void main(String[] args) {
        System.out.println("Создание нового объекта Table в main()");
        Table table2 = new Table();
        System.out.println("Создание нового объекта Cupboard в main()");
        Cupboard cupboard2 = new Cupboard();
        table.f2(1);
        cupboard.f3(1);
        System.out.println("---------");
        table2.f2(1);
        cupboard2.f3(1);
    }
}
