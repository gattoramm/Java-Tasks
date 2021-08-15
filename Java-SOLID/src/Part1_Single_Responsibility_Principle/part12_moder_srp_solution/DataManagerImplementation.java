package Part1_Single_Responsibility_Principle.part12_moder_srp_solution;

public class DataManagerImplementation implements IDataManager{
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
