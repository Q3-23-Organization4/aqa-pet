package homeworks.homework11;


import java.util.Arrays;

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

        Magazine.printMagazines(printableArray);
        Book.printBooks(printableArray);

        Printable myPrinter = () -> System.out.println("Lambda: Printing something");
        myPrinter.print();
    }
}