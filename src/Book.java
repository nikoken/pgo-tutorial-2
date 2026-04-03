public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = true; // Yeni kitap varsayılan olarak kütüphanededir
    }

    public void printInfo() {
        System.out.println(title + "  " + author + "  Pages: " + pageCount + "  Available: " + available);
    }

    public void borrowBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }
}