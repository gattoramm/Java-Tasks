package ITVDN.Part4_Interface_Segregation_Principle.part41_isp_violation;

import java.util.Date;

public class I{
    public String getName() {
        return "name";
    }

    public Date getDate() {
        return new Date();
    }
}
