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

public class Project implements Initializable {
    @FXML
    private TextField ProjectTitle1,TechStack1,Functionality1,ProjectTitle2,TechStack2,Functionality2;

    @FXML
    private TextArea ProjDes1,ProjDes2;

    @FXML
    private Button Save;



    public void saveButton(ActionEvent event) throws IOException {
        GenerateResume.ProjDes1 = ProjDes1.getText();
        GenerateResume.ProjectTitle1 = ProjectTitle1.getText();
        GenerateResume.TechStack1 = TechStack1.getText();
        GenerateResume.Functionality1 = Functionality1.getText();
        GenerateResume.ProjDes2 = ProjDes2.getText();
        GenerateResume.ProjectTitle2 = ProjectTitle2.getText();
        GenerateResume.TechStack2 = TechStack2.getText();
        GenerateResume.Functionality2 = Functionality2.getText();

        Stage stage = (Stage) Save.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ProjDes1.setText(GenerateResume.ProjDes1);
        ProjectTitle1.setText(GenerateResume.ProjectTitle1);
        TechStack1.setText(GenerateResume.TechStack1);
        Functionality1.setText(GenerateResume.Functionality1);
        ProjDes2.setText(GenerateResume.ProjDes2);
        ProjectTitle2.setText(GenerateResume.ProjectTitle2);
        TechStack2.setText(GenerateResume.TechStack2);
        Functionality2.setText(GenerateResume.Functionality2);
    }
}
