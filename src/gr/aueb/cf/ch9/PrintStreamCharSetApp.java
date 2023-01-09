package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * PrintStream with charset
 */
public class PrintStreamCharSetApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\gvogi\\Desktop\\ppp.txt", StandardCharsets.UTF_8);
            PrintWriter pw = new PrintWriter("C:\\Users\\gvogi\\Desktop\\ppp2.txt", "Windows-1252")){
            ps.println("Hello");
            pw.println("Γεια");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
