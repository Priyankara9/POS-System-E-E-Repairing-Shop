package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashController {
    public Label lbtlDateAndTime;

    public void registerButtonOnAction(ActionEvent actionEvent) {
    }

    public void customersButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomersForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void usersButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UsersForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void itemsButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemsForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void partsButtonOnAction(ActionEvent actionEvent) {
    }

    public void reportButtonOnAction(ActionEvent actionEvent) {
    }

    public void placeOrderButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/PlaceOrderForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void statusButtonOnAction(ActionEvent actionEvent) {
    }

    public void addPartsButtonOnAction(ActionEvent actionEvent) {
    }
}
