package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Random;

//Add the functionality to save the text field on given data

public class MainController {

    @FXML
    public Button Gen;
    @FXML
    public Button PersonalInfo;
    @FXML
    public Button Education;
    @FXML
    public Button WorkExp;
    @FXML
    public Button Skills;
    @FXML
    public Button Project;
    @FXML
    public Button Achievement;

    @FXML
    public Button FileLocation;

    @FXML
    public AnchorPane anchor;

    @FXML
    private TextField fileloc;


    public void Personalinfo(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("PersonalInfof.fxml"));
        Stage stage = new Stage();
        stage.setTitle("PersonalInformation");
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Education(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("Education.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Education");
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Skill(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("Skill.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Skills");
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void WorkExp(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("WorkExp.fxml"));
        Stage stage = new Stage();
        stage.setTitle("WorkExp");
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Project(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("Project.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Projects");
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void Achievement(ActionEvent event) throws IOException{
        Parent part = FXMLLoader.load(getClass().getResource("Achievement.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Achievements");
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void GenResume(ActionEvent event) throws IOException{

        GenerateResume.main(null);
        Stage stage = (Stage) Gen.getScene().getWindow();
        stage.close();
    }

    public void Browse(ActionEvent event) throws IOException{
        final DirectoryChooser dir = new DirectoryChooser();
        Stage stage = (Stage)anchor.getScene().getWindow();
        File file = dir.showDialog(stage);
        String x = file.getAbsolutePath();
        fileloc.setText(x);
        GenerateResume.destination = x;

    }
}
