public class Reader {
    private String firstName;
    private String lastName;
    private int readerId;
    private int borrowedBooksCount;

    public Reader(String firstName, String lastName, int readerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.readerId = readerId;
        this.borrowedBooksCount = 0;
    }

    public void printReaderInfo() {
        System.out.println("Reader: " + firstName + " " + lastName + " (ID: " + readerId + ") Borrowed: " + borrowedBooksCount);
    }

    public void incrementBorrowed() {
        borrowedBooksCount++;
    }

    public void decrementBorrowed() {
        if (borrowedBooksCount > 0) borrowedBooksCount--;
    }
}