package gr.aueb.cf.ch7.Exercises;

/**
 *  Encrypts a String
 */
public class EncryptStringPgm {
    static final int NUM_OF_ASCII = 255;
    static String s = "Hello Dr.Androutsos!";

    /**
     *
     * @param s     String to encrypt
     * @param n     value we add to get the next ASCII character,
     *              from the one we currently are
     * @return      An encrypted string, in which every ASCII char == ASCII + n
     */
    public static String encryptString(String s, int n) {
        StringBuilder encryptedString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int asciiVal = s.charAt(i);

            //if n-th char exceeds last in ASCII chart
            if (asciiVal + n > NUM_OF_ASCII) {
                encryptedString.append((char) (asciiVal - NUM_OF_ASCII));
            } else {
                encryptedString.append((char) (asciiVal + n));
            }
        }

        return encryptedString.toString();
    }
}
