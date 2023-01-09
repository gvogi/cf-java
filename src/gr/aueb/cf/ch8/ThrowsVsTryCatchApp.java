package gr.aueb.cf.ch8;

import java.io.IOException;

public class ThrowsVsTryCatchApp {

    public static void main(String[] args) throws IOException {
//        try {
//            char ch = (char) System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw e;
//        }
        try {
            int ch = getChar();
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }

    public static int getChar() throws IOException {
        try {
            return System.in.read();
        } catch (IOException e) {
            e.printStackTrace(); // log
                                 // recover
            throw e;             // rethrow
        }
    }
}
