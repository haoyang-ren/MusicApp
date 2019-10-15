
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
        this("","","","");
    }

    public Music(String album, String artist, String genre, String year) {
        this.album = new SimpleStringProperty(album);
		//TODO: the rest of the constructor
    }

    //TODO: What do you need here?
    
}
