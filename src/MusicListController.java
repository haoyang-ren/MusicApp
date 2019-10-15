
import static java.lang.Math.E;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javax.swing.table.TableColumn;

//TODO: Add Import Statements

public class MusicListController {
    
    @FXML
    private TableView<E> musicList; //TODO: What type of data will populate the TableView? Replace "E"
	
    @FXML
    private TableColumn<E, String> albumColumn; //TODO: What type of data will populate the TableView? Replace "E"
	
	//TODO: Add the other TableColumns
    
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

        musicList.setItems(null); //TODO: Populate the TableView
    }

    private ObservableList<Music> getMusicListData() {
       //TODO: Complete the method.
    }
    
}
