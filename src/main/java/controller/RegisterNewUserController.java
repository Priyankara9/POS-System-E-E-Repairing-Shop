package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterNewUserController {
    public JFXTextField txtName;
    public JFXTextField txtPhoneNo;
    public JFXTextField txtEmail;
    public JFXTextField txtNIC;

    public void backButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) txtName.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void saveButtonOnAction(ActionEvent actionEvent) {
    }
}
