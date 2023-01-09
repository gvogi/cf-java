package gr.aueb.cf.ch2;


/**
 * Παράγει τυχαίες τιμές μεταξύ 1 και 6 όπως ένα ζάρι.*/
public class RandomApp {

    public static void main(String[] args) {
//        min-max -> (Math.random() * (max - min + 1)) + min
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);
    }
}
