package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        Map<String , ProductTwo> products = new HashMap<>() {
            {
            put("ORA", new ProductTwo("ORA", "Oranges", 10.5, 20));
            put("HON", new ProductTwo("HON", "Honey", 12.5, 10));
            put("MIL", new ProductTwo("MIL", "Milk", 1.2, 1));
            put("EGG", new ProductTwo("EGG", "Eggs", 5.2, 6));
        }
        };

        // Τα κριτήρια αναζήτησης αποθηκεύονται πολύ εύκολα σε hasMap με αυτόν τον τρόπο.//start
        Map<String, Object> criteria = new HashMap<>() {{
           put("description", "Eggs");
           put("price", 7.5);
        }};

        String eggs = products.values().stream()
                        .filter(pro -> pro.getDescription().equals(criteria.get("description"))
                && (Double.compare(pro.getPrice(), (double) criteria.get("price")) > 0))
                                .map(ProductTwo::toString)
                                        .collect(Collectors.joining());

        System.out.println(eggs);
        //                                                     //end

//        products.entrySet().forEach(System.out::println);   // is the same as below
//        products.forEach((k, v) -> System.out.println(k + " " + v));
//
//        String orangesStr = products.entrySet().stream()
//                .filter(entry -> entry.getKey().equals("ORA"))
//                .map((Object::toString))
//                .collect(Collectors.joining(", "));

//        System.out.println(orangesStr);

//        String productsByPrice = products.entrySet().stream()
//                .filter(entry -> entry.getValue().getPrice() > 5.1)
//                .map((Object::toString))
//                .collect(Collectors.joining("\n"));
//
////        System.out.println(productsByPrice);
//
//        List<Product> pros = products.values().stream()
//                .filter(product -> product.getPrice() > 10.2)
//                .collect(Collectors.toList());
//
//        pros.forEach(System.out::println);
//
//        int total = products.values().stream()
//                .filter(product -> product.getPrice() > 5)
//                .mapToInt(Product::getQuantity)
//                .sum();
//
//        int total2 = products.values().stream()
//                .filter(product -> product.getPrice() > 10.2)
//                .mapToInt(Product::getQuantity)
//                .reduce(0, Integer::sum);
    }

}
