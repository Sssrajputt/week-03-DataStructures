package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieAtEnd("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999, 8.7);
        mms.addMovieAtPosition(1, "Interstellar", "Christopher Nolan", 2014, 8.6);

        mms.displayMoviesForward();
        mms.displayMoviesReverse();

        mms.updateMovieRating("Inception", 9.0);
        mms.removeMovieByTitle("The Matrix");
        mms.displayMoviesForward();
    }
}