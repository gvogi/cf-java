package gr.aueb.cf.ch2;

/**
 * Int expressions demo
 * */
public class ExpressionsApp {

    public static void main(String[] args) {
//        assignment & initialization
        int num1 = 12;
        int num2 = 5;
//        int result = 0;

        int sum = 0, sub = 0;
        int div = 0, mul = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        mul = num1 * num2;
        mod = num1 % num2;

//        result = num1 - 1
//        result = ++num1;  // num1 -> 13, result1 -> 13
        result1 = num1++; // result -> 12, num -> 13 // Πρώτα η εκχώρηση & μετα το ++
        result2 = ++num1; // num1 -> 13, result1 -> 13 // Πρώτα το ++ και μετά η εκχώρηση
//        result3 = result3 + num1;
//        the above expression equals to:
        result3 += num1;

        result4 = (num1 + num2) * ((num1 / 2) / (num1 % 5));

        System.out.printf("sum: %d\t, sub: %d\t, div: %d\t, mul: %d\t, mod: %d\n",
                sum, sub, div, mul, mod);

        System.out.printf("result1: %d, result2: %d, result3: %d, result4: %d",
                result1, result2, result3, result4);




    }
}
