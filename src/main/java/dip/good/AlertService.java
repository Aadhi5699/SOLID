package dip.good;

public class AlertService {
    private final Notifier notifier;

    public AlertService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendAlert(String msg) {
        notifier.send(msg);
    }
}
