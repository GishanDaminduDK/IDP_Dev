import java.util.ArrayList;
import java.util.List;

class MediaLibrary {
    private List<MediaItem> items;

    // Constructor
    public MediaLibrary() {
        items = new ArrayList<>();
    }

    // Method to add a media item to the library
    public void addItem(MediaItem item) {
        items.add(item);
        System.out.println(item.getClass().getSimpleName() + " '" + item.getTitle() + "' added to the library.");
    }

    // Method to calculate the total duration of all movies in the library
    public double getTotalMovieDuration() {
        double totalDuration = 0.0;
        for (MediaItem item : items) {
            if (item instanceof Movie) {
                totalDuration += ((Movie) item).getDuration();
            }
        }
        return totalDuration;
    }
}
