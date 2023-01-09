package gr.aueb.cf.ch7;

public class SubstringApp {

    public static void main(String[] args) {
        String s = "Athens University Of Economics";
        String subStr = "";

        subStr = s.substring(0, 6); // start index εως  last index -1

        System.out.println(subStr);
    }
}
