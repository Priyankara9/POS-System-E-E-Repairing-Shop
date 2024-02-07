package controller;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UsersFormController {
    public JFXTextField txtUserId;
    public JFXTextField txtName;
    public JFXTextField txtMobileNo;
    public JFXTextField txtEmail;
    public JFXTextField txtNIC;
    public JFXTreeTableView userTable;
    public JFXTextField searchNIC;

    public void backButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) userTable.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void searchButtonOnAction(ActionEvent actionEvent) {
    }

    public void updateButtonOnAction(ActionEvent actionEvent) {
    }
}
