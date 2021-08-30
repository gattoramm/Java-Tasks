package ITVDN.Part5_Dependency_Inversion_Pranciple.part51_dip_violation;

public class SimpleLogin {

    // low level class

    public boolean authenticate(User user) {
        // logic - database
        return true;
    }
}
