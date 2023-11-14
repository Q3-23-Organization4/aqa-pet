package homeworks.homework8.task2;

public class Book implements Printable{
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
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println(((Book) item).getTitle());
            }
        }
    }
}
