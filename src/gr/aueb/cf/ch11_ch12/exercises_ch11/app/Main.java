package gr.aueb.cf.ch11_ch12.exercises_ch11.app;

import gr.aueb.cf.ch11_ch12.exercises_ch11.model.User;
import gr.aueb.cf.ch11_ch12.exercises_ch11.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User alice = new User(1L, "Alice", "Cooper");
        UserCredentials accountAlice = new UserCredentials(1L, "AliceCooper1948", "123456");

        System.out.println(alice.getUserInfo());
        System.out.println(accountAlice.getUserCredentialsInfo());
        System.out.println("User: [" + alice.getUserInfo() + "], "
                + "User credentials: [" + accountAlice.getUserCredentialsInfo() + "]");
    }
}
