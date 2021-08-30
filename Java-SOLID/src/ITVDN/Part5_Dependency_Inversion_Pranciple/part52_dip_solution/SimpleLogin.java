package ITVDN.Part5_Dependency_Inversion_Pranciple.part52_dip_solution;

public class SimpleLogin implements Authenticator {

    // low level class

    public boolean authenticate(User user) {
        // logic - database
        return true;
    }
}
