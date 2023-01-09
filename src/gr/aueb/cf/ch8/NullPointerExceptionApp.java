package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = "Coding Plus"; // null

        if (s != null) {
            if (s.equals("Coding Plus")) {
                System.out.println("Coding+");
            } else {
                System.out.println("No coding plus");
            }
        }else {
            System.out.println("Null Error");
        }
    }
}
