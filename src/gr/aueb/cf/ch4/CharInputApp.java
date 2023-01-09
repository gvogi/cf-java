package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Char input using System.in.read().
 * .read can handle only ASCII characters (1 byte)
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char inputChar = ' ';

        System.out.println("Please insert an ASCII-based char:");
        inputChar = (char) System.in.read();

        System.out.println("char: " + inputChar);
    }
}
