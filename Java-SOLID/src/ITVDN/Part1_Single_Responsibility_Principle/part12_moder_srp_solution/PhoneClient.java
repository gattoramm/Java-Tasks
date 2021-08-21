package ITVDN.Part1_Single_Responsibility_Principle.part12_moder_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplementation(), new DataManagerImplementation());

        phone.dial("0123456789");
        phone.send("message text");
        phone.recieve();
        phone.disconnected();
    }
}
