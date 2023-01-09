package gr.aueb.cf.ch4;

/**
 * compairs two chars
 */
public class CompairApp {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'α';
        boolean greekIsGreater = false;

        System.out.println((int) ch1);
        System.out.println((int) ch2);

        if (ch2 > ch1) {
            greekIsGreater = true;
        }

        System.out.println("ch2 Is greater: " + greekIsGreater);
    }
}
