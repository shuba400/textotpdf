package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PersonalInfoController implements Initializable {
    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField Phone;

    @FXML
    private TextField Nationality;

    @FXML
    private TextField EmailId;

    @FXML
    public Button closeButton;

    @FXML
    public Button Save;


    public void saveButton(ActionEvent event) throws IOException{
        GenerateResume.FirstName = FirstName.getText();
        GenerateResume.LastName = LastName.getText();
        GenerateResume.Phone = Phone.getText();
        GenerateResume.Email = EmailId.getText();
        GenerateResume.Nationality = Nationality.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FirstName.setText(GenerateResume.FirstName);
        LastName.setText(GenerateResume.LastName);
        Phone.setText(GenerateResume.Phone);
        EmailId.setText(GenerateResume.Email);
        Nationality.setText(GenerateResume.Nationality);
    }
}
