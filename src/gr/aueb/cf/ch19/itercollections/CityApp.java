package gr.aueb.cf.ch19.itercollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityApp {

    public static void main(String[] args) {
        //Populate
        //List<String> cities = List.of("Athens", "London", "Paris"); // Unmodifiable
        List<String> cities = new ArrayList<>(List.of("Athens", "London", "Paris")); // Modifiable -- with new ArrayList<> we make array list modifiable

        //Traverse List
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }

        for (String city : cities) {
            System.out.println(city);
        }

        cities.forEach(System.out::println); // Preferable method to iterate List

        //Only way we can delete with safety while iterating
        Iterator<String> it = cities.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            if (s.equals("Paris")) it.remove();
//            if (s.equals("Paris")) cities.remove(s); // with this way we get an error
        }

        //Second method to delete item fom List
        cities.removeIf(s -> s.equals("London"));

        cities.forEach(System.out::println);
    }
}
