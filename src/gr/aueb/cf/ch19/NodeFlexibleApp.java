package gr.aueb.cf.ch19;

public class NodeFlexibleApp {

    public static void main(String[] args) {
        NodeFlexible head = new NodeFlexible();
        head.setItem("CF");
        int data = (int) head.getItem(); // throws error different types to be cast.

        System.out.println(data);
    }
}
