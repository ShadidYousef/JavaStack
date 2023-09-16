import java.util.HashMap;
import java.util.Map;

public class SongMap {
    public static void main(String[] args) {
        Map<String, String> trackList = new HashMap<>();
        // added the songs and their lyrics to the hashmap one by one
        trackList.put("Song 1", "Lyrics 1");
        trackList.put("Song 2", "Lyrics 2");
        trackList.put("Song 3", "Lyrics 3");
        trackList.put("Song 4", "Lyrics 4");
        
        // to search for 1 song using it's title
        String songName = "Song 3";
        String lyrics = trackList.get(songName);
        System.out.println("Lyrics of " + songName + ": " + lyrics);

        // to display all songs and their lyrics
        System.out.println("\nTrack List:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
