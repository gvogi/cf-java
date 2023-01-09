package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 * */

public class BigIntegerApp {

    public static void main(String[] args) {
//      assignment & initialization
        BigInteger bigNum1 = new BigInteger("2455147483647");
        BigInteger bigNum2 = new BigInteger("2483147483647");
        BigInteger result;

        //         commands
        result = bigNum1.add(bigNum2);

        //        print output
        System.out.printf("%,d", result);


    }

}
