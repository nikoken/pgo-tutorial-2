public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library(5);

        myLibrary.addBook(new Book("Java Basics", "John Smith", 300));
        myLibrary.addBook(new Book("Clean Code", "Robert Martin", 450));

        System.out.println("--- Library Inventory ---");
        myLibrary.printAllBooks();

        System.out.println("--- Testing Task 4 ---");
        myLibrary.borrowByTitle("Java Basics"); 
        myLibrary.borrowByTitle("Java Basics"); 
        myLibrary.borrowByTitle("Non-existent Book"); 

        System.out.println("--- Final Status ---");
        myLibrary.printAllBooks();
    }
}