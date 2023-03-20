public class Book {
    String bookName;
    String bookAuthor;

    @Override
    public String toString() {
        return bookName;
    }

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
}
