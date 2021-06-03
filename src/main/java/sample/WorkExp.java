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

public class WorkExp implements Initializable {
    @FXML
    private TextField Comp1,Design1,JoinDate1,EndDate1,Comp2,Design2,JoinDate2,EndDate2;

    @FXML
    private Button Save;



    public void saveButton(ActionEvent event) throws IOException {
        GenerateResume.Comp1 = Comp1.getText();
        GenerateResume.Comp2 = Comp2.getText();
        GenerateResume.Design1 = Design1.getText();
        GenerateResume.Design2 = Design2.getText();
        GenerateResume.JoinDate1 = JoinDate1.getText();
        GenerateResume.EndDate1 = EndDate1.getText();
        GenerateResume.JoinDate2 = JoinDate2.getText();
        GenerateResume.EndDate2 = EndDate2.getText();

        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Comp1.setText(GenerateResume.Comp1);
        Design1.setText(GenerateResume.Design1);
        JoinDate1.setText(GenerateResume.JoinDate1);
        EndDate1.setText(GenerateResume.EndDate1);
        Comp2.setText(GenerateResume.Comp2);
        Design2.setText(GenerateResume.Design2);
        JoinDate2.setText(GenerateResume.JoinDate2);
        EndDate2.setText(GenerateResume.EndDate2);
    }
}
