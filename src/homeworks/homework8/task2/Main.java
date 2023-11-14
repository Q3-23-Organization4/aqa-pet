package homeworks.homework8.task2;

public class Main {
    public static void main(String[] args) {
        Printable[] printableArray = new Printable[]{
                new Book("Book1"),
                new Magazine("Magazine1"),
                new Book("Book2"),
                new Magazine("Magazine2"),
                new Magazine("Magazine3"),
        };

        for (Printable printable : printableArray) {
            printable.print();
        }

        Magazine.printMagazines(printableArray);
        Book.printBooks(printableArray);
    }
}