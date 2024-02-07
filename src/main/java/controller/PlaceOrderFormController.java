package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderFormController {
    public JFXTextField txtCustomerId;
    public JFXTextField txtPhoneNo;
    public JFXTextField txtEmail;
    public JFXTextField txtOrderId;
    public JFXTextField txtItemCode;
    public JFXTextField txtItemName;
    public JFXTextArea txtItemDescription;
    public JFXComboBox txtCategory;

    public void saveButtonOnAction() {
    }

    public void backButtonOnAction() {
        Stage stage=(Stage) txtCategory.getScene().getWindow();
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
