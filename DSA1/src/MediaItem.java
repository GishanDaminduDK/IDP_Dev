import java.util.ArrayList;
import java.util.List;

// Define the MediaItem class (parent class)
class MediaItem {
    private String title;
    private int year;

    // Constructor
    public MediaItem(String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

// Define the Book class (subclass of MediaItem)
class Book extends MediaItem {
    private String author;

    // Constructor
    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    // Getter method
    public String getAuthor() {
        return author;
    }
}

// Define the Movie class (subclass of MediaItem)
class Movie extends MediaItem {
    private double duration; // in hours

    // Constructor
    public Movie(String title, int year, double duration) {
        super(title, year);
        this.duration = duration;
    }

    // Getter method
    public double getDuration() {
        return duration;
    }
}

// Define the MediaLibrary class
