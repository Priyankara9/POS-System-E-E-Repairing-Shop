package controller;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomersFormController {
    public JFXTextField txtCustomerId;
    public JFXTextField txtName;
    public JFXTextField txtMobileNo;
    public JFXTextField txtEmail;
    public JFXTextField searchName;
    public JFXTreeTableView customerTable;

    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    public void searchButtonOnAction(ActionEvent actionEvent) {
    }

    public void backButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) customerTable.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }
}
