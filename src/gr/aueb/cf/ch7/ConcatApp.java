package gr.aueb.cf.ch7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstname = "Georgios";
        String lastname = "Vog";
        String title = "None";
        String fullName1 = "";
        String fullName2 = "";
        String fullName3 = "";
        String fullName4 = "";

        fullName1 = firstname + " " + lastname;
        fullName2 = title + " " + firstname + " " + lastname;

        fullName3 = firstname.concat(" ").concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);

        System.out.println(fullName1);
        System.out.println(fullName2);
        System.out.println(fullName3);
        System.out.println(fullName4);
    }
}
