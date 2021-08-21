package ITVDN.Part1_Single_Responsibility_Principle.part11_moder_srp_violation;

public interface IPhone {

    // connection management
    void dial(String phoneNumber);
    void disconnect();
    //
    // data mangement
    void send(String phoneNumber);
    int recieve();
    //
}
