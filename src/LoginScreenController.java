
import java.io.IOException;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

//TODO: Add Import Statements

public class LoginScreenController {

    //TODO: Add FXML Fields
	
	//TODO: Instatiate the database class
	
	//TODO: Instatiate the PageSwitchHelper class

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
		//TODO: Get the username and password from the GUI
        try {
            ResultSet rs = d.getResultSet(""); //TODO: Fill in this query
            if (!rs.next()) {
               //TODO: What should happen if there is no result?
            } else {
               //TODO: What should happen if there is a result?
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    @FXML
    private void handleNextButtonAction(ActionEvent event) throws IOException {
        //TODO: Look at the PageSwitcherHelper class. How do we use this class?
    }

    @FXML
    public void initialize() {
    //TODO: What should the screen look like when it loads?
    }

}
