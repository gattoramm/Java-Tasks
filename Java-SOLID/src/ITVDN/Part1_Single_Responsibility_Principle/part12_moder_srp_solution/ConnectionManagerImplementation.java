package ITVDN.Part1_Single_Responsibility_Principle.part12_moder_srp_solution;

public class ConnectionManagerImplementation implements IConnectionManager{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected established");
    }

    @Override
    public void disconnected() {
        System.out.println("disconnected");
    }
}
