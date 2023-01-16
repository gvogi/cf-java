package gr.aueb.cf.ch16;

public class SpeakingSchoolDemo {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat();
        ISpeakable blackDog = new Dog();

//        Wiring based on DI and IoC

//        GenericSpeakingSchool genericSpeakingSchool = new GenericSpeakingSchool(whiteCat);
//        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(blackDog);

//        is equal to the statement below
//        var is used as a shorthand for the big instance name on the right

        var genericSpeakingSchool = new GenericSpeakingSchool(whiteCat);
        var genericSpeakingSchool1 = new GenericSpeakingSchool(blackDog);
    }
}
