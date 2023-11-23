package homeworks.homework11;

import java.util.Arrays;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println(title);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("Magazine list ");
        Arrays.stream(printable)
                .filter(item -> item instanceof Magazine)
                .map(item -> (Magazine) item)
                .forEach(Magazine::print);
    }
}