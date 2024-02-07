package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public JFXPasswordField passwordId;
    public JFXButton loginId;
    public JFXTextField userNameId;
    public JFXButton forgotId;
    public ImageView imgId;

    public void loginButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) userNameId.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);

    }

    public void forgotButtonOnAction(ActionEvent actionEvent) {

        Stage stage=(Stage) userNameId.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ForgotPassword.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Password Reset");
        stage.show();
        stage.setResizable(false);

    }
}
