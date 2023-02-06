package gr.aueb.cf.ch20.regexapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// gets as input a string containing any 6 chars
// and asserts that the string includes at least
// one lowercase letter
public class LowercaseValidationApp {

    public static void main(String[] args) {

//        String s = "A123j4567";
        String s = "Ahdsf9rulkg0";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
