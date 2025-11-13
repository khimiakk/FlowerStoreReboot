package ucu.apps.flowerstorereboot.user;

public class Receiver implements User {
    private String status;

    @Override
    public void update(String status) {
        this.status = (status != null) ? status : "received";
    }
}
