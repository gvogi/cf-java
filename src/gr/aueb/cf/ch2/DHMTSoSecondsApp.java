package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Converts days, hours, minutes, seconds
 * in total seconds
 */
public class DHMTSoSecondsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final long SEC_PER_DAY = 3600 * 24; // long και να αποφύγουμε το (αυτόματο) typecast
        final long SEC_PER_HOUR = 3600; // long και να αποφύγουμε το (αυτόματο) typecast
        final long SEC_PER_MIN = 60; // long και να αποφύγουμε το (αυτόματο) typecast
        long totalSeconds = 0L;
        long inputDays = 0L;
        long inputHours = 0L;
        long inputMinutes = 0L;
        long inputSecs = 0L;

        System.out.println("Please insert : days, hours, minutes, seconds (ints):");
        inputDays = in.nextLong();
        inputHours = in.nextLong();
        inputMinutes = in.nextLong();
        inputSecs = in.nextLong();

        totalSeconds = (inputDays * SEC_PER_DAY) + (inputHours * SEC_PER_HOUR)
                + (inputMinutes * SEC_PER_MIN) + inputSecs;

        System.out.printf(Locale.US, "Total seconds: %,d", totalSeconds);
    }
}
//   Local GR result:
//    Please insert : days, hours, minutes, seconds (ints):
//        12 20 54 32
//        Total seconds: 1.112.072
//        Process finished with exit code 0
//
//Local US result:
//12 20 54 32
//Total seconds: 1,112,072
//Process finished with exit code 0