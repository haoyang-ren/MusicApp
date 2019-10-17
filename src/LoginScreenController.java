
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

//TODO: Add Import Statements
public class LoginScreenController {

    //TODO: Add FXML Fields
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    //TODO: Instatiate the database class
    Database d = new Database();
    //TODO: Instatiate the PageSwitchHelper class
    PageSwitchHelper psh = new PageSwitchHelper();

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        //TODO: Get the username and password from the GUI
        String userString = username.getText();
        String passString = password.getText();
        String getResult = "SELECT * FROM USER "
                + "WHERE username = '" + userString + "' "
                + "AND password = '" + passString + "';";

        try {
            ResultSet rs = d.getResultSet(getResult); //TODO: Fill in this query
            if (!rs.next()) {
                //TODO: What should happen if there is no result?
                System.out.println("Login Failed!");
            } else {
                //TODO: What should happen if there is a result?
                System.out.println("Login Success!");
                psh.switcher(event, "MusicList.fxml");
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    public void initialize() {
        //TODO: What should the screen look like when it loads?
        
    }

}
