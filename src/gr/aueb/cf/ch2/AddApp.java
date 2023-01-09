package gr.aueb.cf.ch2;

/**
 * Prints in console a 2 int addition
 * */
public class AddApp {

    public static void main(String[] args) {
//      assignment & initialization
        int num1 = 5;
        int num2 = 2_147_483_647;
        int result = 0;

//         commands
        result = num1 + num2;

//        print output
//        System.out.println("Το αποτέλεσμα των " + num1 " και " + num2 " είναι: " + result);
        System.out.printf("Το αποτέλεσμα των %d και %d είναι: %,d\n", num1, num2, result);
    }
}
