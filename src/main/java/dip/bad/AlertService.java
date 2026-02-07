package dip.bad;

public class AlertService {
    private EmailNotifier email = new EmailNotifier();

    public void send(String msg) {
        email.sendEmail(msg);
    }
}
