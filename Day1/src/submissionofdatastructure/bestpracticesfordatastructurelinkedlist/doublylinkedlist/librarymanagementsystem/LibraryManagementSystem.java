package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.librarymanagementsystem;

class LibraryManagementSystem {
    private BookNode head;
    private BookNode tail;
    private int bookCount;

    LibraryManagementSystem() {
        this.head = null;
        this.tail = null;
        this.bookCount = 0;
    }

    public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }

    public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            newBook.prev = tail;
            tail.next = newBook;
            tail = newBook;
        }
        bookCount++;
    }

    public void addBookAtPosition(int position, String title, String author, String genre, int bookID, boolean isAvailable) {
        if (position == 0) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
        BookNode current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                return; // Position is out of bounds
            }
            current = current.next;
        }
        if (current.next == null) {
            addBookAtEnd(title, author, genre, bookID, isAvailable);
        } else {
            newBook.next = current.next;
            newBook.prev = current;
            current.next.prev = newBook;
            current.next = newBook;
        }
        bookCount++;
    }

    public void removeBookByID(int bookID) {
        BookNode current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current == head) {
                    head = current.next;
                }
                if (current == tail) {
                    tail = current.prev;
                }
                bookCount--;
                return;
            }
            current = current.next;
        }
    }

    public void searchBookByTitleOrAuthor(String title, String author) {
        BookNode current = head;
        while (current != null) {
            if ((title != null && current.title.equals(title)) || (author != null && current.author.equals(author))) {
                System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookID + ", Available: " + current.isAvailable);
            }
            current = current.next;
        }
    }

    public void updateBookAvailability(int bookID, boolean newStatus) {
        BookNode current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = newStatus;
                return;
            }
            current = current.next;
        }
    }

    public void displayBooksForward() {
        BookNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookID + ", Available: " + current.isAvailable);
            current = current.next;
        }
    }

    public void displayBooksReverse() {
        BookNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Author: " + current.author + ", Genre: " + current.genre + ", Book ID: " + current.bookID + ", Available: " + current.isAvailable);
            current = current.prev;
        }
    }

    public int countTotalBooks() {
        return bookCount;
    }
}
