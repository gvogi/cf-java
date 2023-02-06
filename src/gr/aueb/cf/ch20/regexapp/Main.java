package gr.aueb.cf.ch20.regexapp;

public class Main {

    public static void main(String[] args) {
//        String s = "Red";
//        System.out.println(isRed(s));

//        String s = "Green";
//        System.out.println(isRedOrGreen(s));

//        String s = "green";
//        System.out.println(isRedOrGreen(s));

//        String s = "green";
//        System.out.println(isRredOrGgreen(s));

//        String s = "Ging";
//        System.out.println(hasOneUppercaseEndsWithIng(s));

//        String s = "ging"; // or String s = "Ging";
//        System.out.println(hasOneUpperLowercaseEndsWithIng(s));

//        String s = "!!!99@@@###";
//        System.out.println(isLetterDigitAnywhere(s));


    }

    // If is "Red"
    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    // If is "Red" or "Green"
    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    // If is "Red" or "red" or "Green" or"green"
    public static boolean isRredOrGgreen(String s) {
        return s.matches("[Rr]ed|[Gg]reen");
    }

    // Begin with one uppercase letter and then end with "ing"
    public static boolean hasOneUppercaseEndsWithIng(String s) {
        return s.matches("[A-Z]ing");
    }

    // Begin with one uppercase/lowercase letter and then end with "ing"
    public static boolean hasOneUpperLowercaseEndsWithIng(String s) {
        return s.matches("[a-zA-Z]ing");
    }


    // mata characters
    /*
    * . Οποιοσδήποτε χαρακτήρας
    * ^ Αρχή Γραμμής
    * $ Τέλος String
    * \w Χαρακτήρας λέξης a-zA-Z0-9_
    * \W οποιοσδήποτε χαρακτήρας εκτός απο χαρακτήρα λέξης
    * \s whitespace
    * \d Any digit
    * \D Any character except digit
    */

    //One space, then one digit
    public static boolean isAnySpace(String s) {
        return s.matches("\\s\\d");
    }

    //One letter, then one digit
    public static boolean isLetterDigit(String s){
        return s.matches("\\w\\d");
    }

    //Letter-Digit Anywhere inside a string
    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*");
    }

    // Letter-Digit as a whole word
    public static boolean isLetterDigitAsWord(String s) {
        return s.matches(".*\\b\\w\\d\\b.*");
    }

    //Ποσοδείκτες
    /*
    * ? zero or more times
    * + one or more times
    * * zero or more times
    * {n} n appearances exactly
    * {n, m} Between n and m appearances
    * {n, } At least n appearances
    * { ,m} At most m appearances
    */

    //e-mail
    public static boolean isValidEmail(String s) {
        return  s.matches("\\w*\\.?\\w+@\\.(com|gr)");
    }

    // Two uppercase letters Dash seven Digits
    public static boolean isTwoUppercaseLetterDashSevenDigits(String s) {
        return s.matches("[A-Z]{2}-\\d{7}");
    }

    //Returns an array of tokens delimited by one or more spaces
    public static String [] getTokens(String s) {
        return s.split("\\s+"); // or return s.split(" +");
    }

    //Replaces one or more spaces with one space
    public static String normalizeStr(String s) {
        return s.replace("\\s", " ");
    }

    //Swap
    public static String mutuallyChange(String s) {
       return s.replaceAll("(.*)\\s+(.*)", "$2 $1");// $2 second group of regex in () $1 first group of regex in ()
    }


}
