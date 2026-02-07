package dip.good;

public class SmsNotifier implements Notifier {
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}
