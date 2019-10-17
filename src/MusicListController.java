
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

//TODO: Add Import Statements
public class MusicListController {

    @FXML
    private TableView<Music> musicList; //TODO: What type of data will populate the TableView? Replace "E"

    @FXML
    private TableColumn<Music, String> albumColumn; //TODO: What type of data will populate the TableView? Replace "E"

    //TODO: Add the other TableColumns
    @FXML
    private TableColumn<Music, String> artistColumn;
    @FXML
    private TableColumn<Music, String> genreColumn;
    @FXML
    private TableColumn<Music, String> yearColumn;

    Database database = new Database();

    @FXML
    public void initialize() {
        artistColumn.setCellValueFactory(
                cellData -> cellData.getValue().getArtistProperty());
        albumColumn.setCellValueFactory(
                cellData -> cellData.getValue().getAlbumProperty());
        genreColumn.setCellValueFactory(
                cellData -> cellData.getValue().getGenreProperty());
        yearColumn.setCellValueFactory(
                cellData -> cellData.getValue().getYearProperty());

        musicList.setItems(getMusicListData()); //TODO: Populate the TableView
    }

    private ObservableList<Music> getMusicListData() {
        //TODO: Complete the method.
        ArrayList<Music> musicArray = new ArrayList<Music> ();
        Music bs = new Music("Baby one more time", "Britney Spears", "Pop", "1999");
        musicArray.add(bs);
        Music sweetener = new Music("Sweetner", "Ariana Grande", "Pop", "2018");
        musicArray.add(sweetener);
        Music thankUNext = new Music("Thank U, Next ", "Ariana Grande", "Pop", "2019");
        musicArray.add(thankUNext);
        Music lover = new Music("Lover", "Taylor Swift", "Pop", "2019");
        musicArray.add(lover);
        //ObservableList<Music> musicList = FXCollections.observableArrayList(musicArray);
        return FXCollections.observableArrayList(musicArray);
    }

}
