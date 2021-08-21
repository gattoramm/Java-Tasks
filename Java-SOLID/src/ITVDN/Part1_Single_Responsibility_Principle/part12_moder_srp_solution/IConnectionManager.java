package ITVDN.Part1_Single_Responsibility_Principle.part12_moder_srp_solution;

public interface IConnectionManager {
    void dial(String phoneNumber);
    void disconnected();
}
