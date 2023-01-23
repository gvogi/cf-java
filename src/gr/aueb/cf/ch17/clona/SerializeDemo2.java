package gr.aueb.cf.ch17.clona;

import java.io.*;

public class SerializeDemo2 {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/trainee.ser"))){

            Trainee alice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(alice);
            System.out.println("Success in Serialization");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Serializable Exception" + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException" + e2);
            e2.printStackTrace();
        }
    }
}
