package gr.aueb.cf.ch7.Exercises;

import static gr.aueb.cf.ch7.Exercises.EncryptStringPgm.NUM_OF_ASCII;
import static gr.aueb.cf.ch7.Exercises.EncryptStringPgm.s;

/**
 * Decrypts an encrypted String that
 * receives from the EncryptStringPgm.
 */
public class DecryptStringPgm {

    public static void main(String[] args) {
        int n = 1;

        String x = EncryptStringPgm.encryptString(s, n);
        decryptString(x, n);
    }

    /**
     *
     * @param x    The Encrypted String received
     * @param n    The Value we subtract to get the
     *             previous ASCII character,
     *             from the one we currently are
     */
    public static void decryptString(String x, int n) {
    StringBuilder decryptedString = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            int asciiVal = x.charAt(i);

            //if n-th char exceeds first in ASCII chart
            if (asciiVal - n < 0) {
                decryptedString.append((char) (asciiVal + NUM_OF_ASCII));
            } else {
                decryptedString.append((char) (asciiVal - n));
            }
        }

        System.out.println(decryptedString);
    }
}
