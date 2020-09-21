public class Book {
    private String author;
    private String title;

    public Book(String author, String title){
    };

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book winnieThePooh = Book.of("A.A.Milne", "Winnie the Pooh");
    }
}