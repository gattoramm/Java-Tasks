package ITVDN.Part5_Dependency_Inversion_Pranciple.part51_dip_violation;

public class LoginManager {

    // high level class

    SimpleLogin simpleLogin = new SimpleLogin();

    public void login(User user) {
        simpleLogin.authenticate(user);
    }
}
