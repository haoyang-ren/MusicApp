
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//TODO: Add Import Statements
public class Music {

    //StringProperty is needed for TableView
    private StringProperty album;
    private StringProperty artist;
    private StringProperty genre;
    private StringProperty year;

    //Default fallback constructor
    public Music() {
        this("", "", "", "");
    }

    public Music(String album, String artist, String genre, String year) {
        this.album = new SimpleStringProperty(album);
        //TODO: the rest of the constructor
        this.artist = new SimpleStringProperty(artist);
        this.genre = new SimpleStringProperty(genre);
        this.year = new SimpleStringProperty(year);
    }

    //TODO: What do you need here?

    public StringProperty getAlbumProperty() {
        return album;
    }

    public void setAlbum(StringProperty album) {
        this.album = album;
    }

    public StringProperty getArtistProperty() {
        return artist;
    }

    public void setArtist(StringProperty artist) {
        this.artist = artist;
    }

    public StringProperty getGenreProperty() {
        return genre;
    }

    public void setGenre(StringProperty genre) {
        this.genre = genre;
    }

    public StringProperty getYearProperty() {
        return year;
    }

    public void setYear(StringProperty year) {
        this.year = year;
    }
    
}
