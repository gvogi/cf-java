package gr.aueb.cf.ch7;

public class ReplaceApp {

    public static void main(String[] args) {
        String firstname = "Maria-Hellen";
        String nickname = "";
        String simplename = "";

        nickname = firstname.replace("-Hellen", "");
        simplename = firstname.replace("-", "");

        System.out.println(firstname);
        System.out.println(nickname);
        System.out.println(simplename);
    }
}
