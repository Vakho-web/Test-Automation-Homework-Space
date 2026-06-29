//@author Vakho Gvishiani

package homework7;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title) {
        this(title, "Unknown", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }

    public static void main(String[] args) {

        Book b1 = new Book("Mistborn");
        Book b2 = new Book("Mistborn", "Brandon Sanderson");
        Book b3 = new Book("Mistborn", "Brandon Sanderson", 2006);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
