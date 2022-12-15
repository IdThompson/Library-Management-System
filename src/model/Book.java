package model;

public class Book extends Base{
    private String bookTitle;
    private int numberOfCopy;
    private String author;
    private boolean available;

    public Book(String bookTitle, int numberOfCopy, String author, boolean available) {
        super(bookTitle,numberOfCopy,author, available);
        this.bookTitle = bookTitle;
        this.numberOfCopy = numberOfCopy;
        this.author = author;
        this.available = available;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getNumberOfCopy() {
        return numberOfCopy;
    }

    public void setNumberOfCopy(int numberOfCopy) {
        this.numberOfCopy = numberOfCopy;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", numberOfCopy=" + numberOfCopy +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
