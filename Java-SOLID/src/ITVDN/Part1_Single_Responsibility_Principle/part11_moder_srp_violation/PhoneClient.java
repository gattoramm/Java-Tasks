package ITVDN.Part1_Single_Responsibility_Principle.part11_moder_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("0123456789");
        phone.send("message text");
        phone.recieve();
        phone.disconnect();
    }
}
