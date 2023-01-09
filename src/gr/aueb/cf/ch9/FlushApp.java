package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {

    public static void main(String[] args) {

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\gvogi\\Desktop\\tmp\\Flush-text.txt");
            pw.print("Hello");
            //pw.flush();
            //pw.close(); // at close pw is auto flush
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
