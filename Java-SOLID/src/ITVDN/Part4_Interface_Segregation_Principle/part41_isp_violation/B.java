package ITVDN.Part4_Interface_Segregation_Principle.part41_isp_violation;

public class B {
    private I i;

    public B(I i) {
        this.i = i;
    }

    public void callGetDate() {
        System.out.println(i.getDate());
    }
}
