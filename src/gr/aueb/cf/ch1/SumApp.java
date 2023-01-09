package gr.aueb.cf.ch1;

import java.util.Locale;

/**
 *Προσθέτει 2 ακέραιους και εμφανίζει το αποτέλεσμα στην κονσόλα
 */
public class SumApp {

    public static void main(String[] args) {
//        Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 19000256;
        int num2 = 2356212;
        int sum = 0;

//        Εντολές
        sum = num1 + num2;

//        Εμφάνιση
        System.out.println("Το άθροισμα των " + num1 + " , " + num2 + " είναι " + sum);
        System.out.printf(Locale.US,"Το άθροισμα των %,d , %,d είναι %,d %n", num1, num2, sum);
        System.out.printf(Locale.forLanguageTag("el"),"Το άθροισμα των %,d , %,d είναι %,d %n", num1, num2, sum);
    }
}
