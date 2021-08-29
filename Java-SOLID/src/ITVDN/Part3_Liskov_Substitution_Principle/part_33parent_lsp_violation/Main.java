package ITVDN.Part3_Liskov_Substitution_Principle.part_33parent_lsp_violation;

public class Main {
    public static void main(String[] args) {
        Parent parent =new Parent();
        parent.doSmth();

        Child child =new Child();
        child.doSmth();
    }
}
