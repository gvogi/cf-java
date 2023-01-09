package gr.aueb.cf.ch4;

/**
 * Prints unicode chars greater than
 * 4 hex digits by using surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1f600;
        // 0x prefix converts a hex like 1f600
        // to decimal

        System.out.println("Smiley: \uD83D\uDE00");

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
