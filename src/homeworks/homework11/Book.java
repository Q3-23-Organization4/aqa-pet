package homeworks.homework11;

import java.util.Arrays;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println(title);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("Bool list ");
        Arrays.stream(printable)
                .filter(item -> item instanceof Book)
                .map(item -> (Book) item)
                .forEach(Book::print);
    }
}
