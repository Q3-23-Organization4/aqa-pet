package homework11;


import java.util.Arrays;

import static homework11.Book.printBooks;
import static homework11.Magazine.printMagazines;

public class Main {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[]{
                new Book("Book1"),
                new Magazine("Magazine1"),
                new Book("Book2"),
                new Magazine("Magazine2"),
                new Magazine("Magazine3"),
        };

        Arrays.stream(printableArray).toList().forEach(Printable::print);

        printMagazines(printableArray);
        printBooks(printableArray);

        Printable myPrinter = () -> System.out.println("Lambda: Printing something");
        myPrinter.print();
    }
}