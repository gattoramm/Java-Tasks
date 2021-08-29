package ITVDN.Part3_Liskov_Substitution_Principle.part_33parent_lsp_violation;

public class Child extends Parent{
    @Override
    public void doSmth() {
        throw new RuntimeException();
    }
}
