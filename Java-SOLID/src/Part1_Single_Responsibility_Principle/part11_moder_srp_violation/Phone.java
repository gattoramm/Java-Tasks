package Part1_Single_Responsibility_Principle.part11_moder_srp_violation;

public class Phone implements IPhone {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connected established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }

    @Override
    public void send(String phoneNumber) {
        System.out.println("data send successfully");
    }

    @Override
    public int recieve() {
        System.out.println("data recieved successfully");
        return 0;
    }
}
