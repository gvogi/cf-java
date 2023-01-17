package gr.aueb.cf.ch16.abst;

public class Cat extends Animal {

    // Mandatory to be overridden
    @Override
    public void speak() {
        System.out.println("Miew");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all the food!");
    }
}
