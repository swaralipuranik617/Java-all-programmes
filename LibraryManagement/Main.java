import library.Book;

public class Main {
    public static void main(String[] args) {

        Book b = new Book(
            101,
            "Operating Systems",
            "William Stallings",
            599.00
        );

        b.displayBook();
    }
}