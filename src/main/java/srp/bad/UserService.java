public class UserService {

    public void register(String username) {
        System.out.println("Saving user to DB...");
    }

    public void sendWelcomeEmail(String username) {
        System.out.println("Sending email...");
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
