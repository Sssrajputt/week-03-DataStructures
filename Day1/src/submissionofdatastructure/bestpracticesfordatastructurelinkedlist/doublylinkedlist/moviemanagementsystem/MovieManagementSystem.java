package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.moviemanagementsystem;

class MovieManagementSystem {
    private MovieNode head;
    private MovieNode tail;

    MovieManagementSystem() {
        this.head = null;
        this.tail = null;
    }

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            newMovie.prev = tail;
            tail.next = newMovie;
            tail = newMovie;
        }
    }

    public void addMovieAtPosition(int position, String title, String director, int year, double rating) {
        if (position == 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        MovieNode current = head;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                return; // Position is out of bounds
            }
            current = current.next;
        }
        if (current.next == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            current.next.prev = newMovie;
            current.next = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
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
                return;
            }
            current = current.next;
        }
    }

    public void searchMovieByDirectorOrRating(String director, Double rating) {
        MovieNode current = head;
        while (current != null) {
            if ((director != null && current.director.equals(director)) || (rating != null && current.rating == rating)) {
                System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            }
            current = current.next;
        }
    }

    public void displayMoviesForward() {
        MovieNode current = head;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    public void displayMoviesReverse() {
        MovieNode current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title + ", Director: " + current.director + ", Year: " + current.year + ", Rating: " + current.rating);
            current = current.prev;
        }
    }

    public void updateMovieRating(String title, double newRating) {
        MovieNode current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                return;
            }
            current = current.next;
        }
    }
}
