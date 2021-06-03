package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Education implements Initializable {
    @FXML
    private TextField Institute;

    @FXML
    private TextField PassYear;

    @FXML
    private TextField Grade;

    @FXML
    private TextField Course;

    @FXML
    public Button Save;

    public void saveButton(ActionEvent event) throws IOException {
        GenerateResume.Institute = Institute.getText();
        GenerateResume.PassYear = PassYear.getText();
        GenerateResume.Grade= Grade.getText();
        GenerateResume.Course = Course.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Institute.setText(GenerateResume.Institute);
        PassYear.setText(GenerateResume.PassYear);
        Grade.setText(GenerateResume.Grade);
        Course.setText(GenerateResume.Course);
    }
}
