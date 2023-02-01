package gr.aueb.cf.ch19.products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // populate
//        List<Product> products = new ArrayList<>(List.of(
//                new Product("Oranges", 2.5, 100),
//                new Product("Eggs", 8, 6),
//                new Product("Apples", 4.7, 5),
//                new Product("Milk", 1.8, 1),
//                new Product("Honey", 12.2, 1)
//        ));

        List<Product> products = new ArrayList<>(List.of(
                new Product("Oranges", 2.5, 100),
                new Product("Eggs", 8, 6),
                new Product("Apples", 4.7, 5),
                new Product("Milk", 1.8, 1),
                new Product("Honey", 12.2, 1),
                new Product("Oranges", 10.5, 10),
                new Product("Oranges", 12.5, 10)
        ));

//        products.sort(Comparator.comparing(Product::getDescription));
//        products.sort(Comparator.comparing(Product::getDescription, Comparator.reverseOrder()));

        products.sort(Comparator.comparing(Product::getDescription)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                .thenComparing(Product::getQuantity));

//        products.sort(Comparator.comparing(Product::getQuantity)
//                .thenComparing(Product::getDescription)
//                .thenComparing(Product::getPrice));

        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription, (a1, a2) -> a1.length() - a2.length()));
//        products.sort(Comparator.comparing(Product::getDescription, (a1, a2) -> a1.compareTo(a2)));


//        Collections.sort(products, Comparator.naturalOrder());
//        products.forEach(System.out::println);
//
//        System.out.println();
//
//        // to get reverse ordering, first we must do natural ordering
//        Collections.sort(products, Comparator.reverseOrder());
//        products.forEach(System.out::println);

//        Collections.sort(products);
//        products.forEach(System.out::println);
    }
}
