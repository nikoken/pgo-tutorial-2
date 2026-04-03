public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Smith", 500);
        Reader r1 = new Reader("Ahmet", "Yilmaz", 101);

        b1.printInfo();
        r1.printReaderInfo();

        System.out.println("    Borrowing process    ");
        b1.borrowBook();
        r1.incrementBorrowed();

        b1.printInfo();
        r1.printReaderInfo();
    }
}