package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.librarymanagementsystem;

public class Main {

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBookAtBeginning("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1, true);
        lms.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 2, true);
        lms.addBookAtPosition(1, "1984", "George Orwell", "Dystopian", 3, false);

        lms.displayBooksForward();
        lms.displayBooksReverse();

        lms.updateBookAvailability(1, false);
        lms.removeBookByID(2);
        lms.displayBooksForward();

        System.out.println("Total Books: " + lms.countTotalBooks());
    }
}