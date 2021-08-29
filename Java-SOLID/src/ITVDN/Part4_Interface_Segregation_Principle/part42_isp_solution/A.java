package ITVDN.Part4_Interface_Segregation_Principle.part42_isp_solution;

public class A {
    private I1 i1;

    public A(I1 i1) {
        this.i1 = i1;
    }

    public void callGetName() {
        System.out.println(i1.getName());;
    }
}
