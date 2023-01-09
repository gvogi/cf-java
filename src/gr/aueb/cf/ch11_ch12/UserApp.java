package gr.aueb.cf.ch11_ch12;

public class UserApp {

    public static void main(String[] args) {
        User alice = new User();
        User bob = new User();
        User chris = new User(3L, "chris", "R.");

        System.out.println(User.getUsersCount());
    }
}
