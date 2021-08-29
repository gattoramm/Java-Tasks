package ITVDN.Part4_Interface_Segregation_Principle.part41_isp_violation;

public class A {
    private I i;

    public A(I i) {
        this.i = i;
    }

    public void callGetName() {
        System.out.println(i.getName());;
    }
}
