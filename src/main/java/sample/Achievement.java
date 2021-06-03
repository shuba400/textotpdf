package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Achievement implements Initializable {

    @FXML
    private TextField Ach1,AchDate1,Ach2,AchDate2,Ach3,AchDate3;

    @FXML
    private TextArea AchDes1,AchDes2,AchDes3;

    @FXML
    private Button Save;

    public void saveButton(ActionEvent event) throws IOException {
        GenerateResume.Ach1 = Ach1.getText();
        GenerateResume.AchDate1 = AchDate1.getText();
        GenerateResume.Ach2 = Ach2.getText();
        GenerateResume.AchDate2 = AchDate2.getText();
        GenerateResume.Ach3 = Ach3.getText();
        GenerateResume.AchDate3 = AchDate3.getText();
        GenerateResume.AchDes1 = AchDes1.getText();
        GenerateResume.AchDes2 = AchDes2.getText();
        GenerateResume.AchDes3 = AchDes3.getText();
        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Ach1.setText(GenerateResume.Ach1);
        Ach2.setText(GenerateResume.Ach2);
        Ach3.setText(GenerateResume.Ach3);
        AchDate1.setText(GenerateResume.AchDate1);
        AchDate2.setText(GenerateResume.AchDate2);
        AchDate3.setText(GenerateResume.AchDate3);
        AchDes1.setText(GenerateResume.AchDes1);
        AchDes2.setText(GenerateResume.AchDes2);
        AchDes3.setText(GenerateResume.AchDes3);
    }
}
