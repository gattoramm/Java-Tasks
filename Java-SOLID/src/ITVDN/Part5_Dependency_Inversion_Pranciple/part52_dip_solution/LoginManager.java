package ITVDN.Part5_Dependency_Inversion_Pranciple.part52_dip_solution;

public class LoginManager {

    // high level class

    Authenticator authenticator;

    public LoginManager(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(User user) {
        authenticator.authenticate(user);
    }
}
