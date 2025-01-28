package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.librarymanagementsystem;

class BookNode {
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    BookNode prev;
    BookNode next;

    BookNode(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}