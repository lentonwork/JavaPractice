package Songs;

public class Song {
    public String getArtist() {
        return artist;
    }

    private String artist;

    public String getTitle() {
        return title;
    }

    private String title;

    public Song(String artist, String title){   //This is a constructor
        this.artist = artist;
        this.title = title;
    }

    public static void main(String[] args) {
        Song dan_song = new Song("Childish Gambino", "Redbone");
        System.out.println(dan_song.getTitle() + " is by " + dan_song.getArtist());
    }
}
