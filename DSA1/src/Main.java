// Main class to demonstrate the media library system
public class Main {
    public static void main(String[] args) {
        // Create a media library
        MediaLibrary library = new MediaLibrary();

        // Add books and movies to the library
        library.addItem(new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald"));
        library.addItem(new Movie("Inception", 2010, 2.5));
        library.addItem(new Movie("The Shawshank Redemption", 1994, 2.25));
        library.addItem(new Book("To Kill a Mockingbird", 1960, "Harper Lee"));

        // Calculate and display the total duration of movies in the library
        double totalMovieDuration = library.getTotalMovieDuration();
        System.out.println("Total duration of movies in the library: " + totalMovieDuration + " hours");
    }
}
