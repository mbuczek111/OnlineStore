package onlinestore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookStore {
    public static void main(String[] args) {
        Comparator<Book> compareByPrice = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        };
        Comparator<Book> compareByName = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        ArrayList<Book> catalogue = new ArrayList<>();
        catalogue.add(new Book("aJava. Podstawy",99.00));
        catalogue.add(new Book("dProgramowanie w Javie",189.00));
        catalogue.add(new Book("bJava. Przewodnik dla poczatkujacych",89.00));
        catalogue.add(new Book("cMysl w jezyku Java!",49.00));

        Collections.sort(catalogue, compareByName);
        System.out.println("Alphabetically:");
        System.out.println(catalogue);
        Collections.sort(catalogue, compareByName.reversed());
        System.out.println("Reversed");
        System.out.println(catalogue);
        Collections.sort(catalogue, compareByPrice);
        System.out.println("By price");
        System.out.println(catalogue);
        Collections.sort(catalogue, compareByPrice.reversed());
        System.out.println("Reversed");
        System.out.println(catalogue);
    }
}
