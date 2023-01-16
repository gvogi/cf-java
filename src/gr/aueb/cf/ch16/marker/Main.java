package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Item book = new Book(1L, "123", "Th", "Java I");
        Item cd = new CompactDisc(1L, "Prince");

        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered");
        } else if (item instanceof CompactDisc) {
            System.out.println("CD delivered");
        } else {
            throw new AssertionError(item);
        }
    }
}
