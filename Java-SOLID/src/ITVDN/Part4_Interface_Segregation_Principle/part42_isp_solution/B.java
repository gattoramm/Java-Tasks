package ITVDN.Part4_Interface_Segregation_Principle.part42_isp_solution;

public class B {
    private I2 i2;

    public B(I2 i2) {
        this.i2 = i2;
    }

    public void callGetDate() {
        System.out.println(i2.getDate());
    }
}
