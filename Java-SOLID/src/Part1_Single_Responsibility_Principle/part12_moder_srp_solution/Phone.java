package Part1_Single_Responsibility_Principle.part12_moder_srp_solution;

public class Phone implements IConnectionManager, IDataManager{

    private IConnectionManager connection;
    private IDataManager dataChannel;

    public Phone(IConnectionManager connection, IDataManager dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnected() {
        connection.disconnected();
    }

    @Override
    public void send(String phoneNumber) {
        dataChannel.send(phoneNumber);
    }

    @Override
    public int recieve() {
        dataChannel.recieve();
        return 0;
    }
}
