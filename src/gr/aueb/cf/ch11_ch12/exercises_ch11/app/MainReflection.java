package gr.aueb.cf.ch11_ch12.exercises_ch11.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainReflection {

    public static void main(String[] args) {
        try {
            Class<?> class1 = Class.forName("gr.aueb.cf.ch11_ch12.exercises_ch11.model.User");
            Class<?> class2 = Class.forName("gr.aueb.cf.ch11_ch12.exercises_ch11.model.UserCredentials");

            Constructor<?> ctr1 = class1.getConstructor(Long.class, String.class, String.class);
            Object alice = ctr1.newInstance(1L, "Alice", "Cooper");
            Constructor<?> ctr2 = class2.getConstructor(Long.class, String.class, String.class);
            Object accountAlice = ctr2.newInstance(1L, "AliceCooper1948", "123456");

            Method getUserInfo = class1.getMethod("getUserInfo");
            Method getUserCredentialsInfo = class2.getMethod("getUserCredentialsInfo");

            System.out.println(getUserInfo.invoke(alice));
            System.out.println(getUserCredentialsInfo.invoke(accountAlice));
            System.out.println("User: [" + getUserInfo.invoke(alice) + "], "
                    + "User credentials: [" + getUserCredentialsInfo.invoke(accountAlice) + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
