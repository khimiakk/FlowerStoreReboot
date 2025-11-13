package ucu.apps.flowerstorereboot.user;

public class Sender implements User {
    private String status;

    @Override
    public void update(String status) {
        this.status = (status != null) ? status : "sent";
    }
}
