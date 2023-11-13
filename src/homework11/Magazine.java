package homework11;

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

    public static void printMagazines(Printable[] printable){
        System.out.println("Magazine list ");
        for (Printable item : printable){
            if (item instanceof Magazine){
                System.out.println(((Magazine) item).getTitle());
            }
        }
    }


}