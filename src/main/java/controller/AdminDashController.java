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
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/RegisterNewUserForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Register New User");
        stage.show();
        stage.setResizable(false);
    }

    public void customersButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomersForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("View Customers");
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
        stage.setTitle("View Users");
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
        stage.setTitle("Items");
        stage.show();
        stage.setResizable(false);
    }

    public void partsButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SparePartsForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("All Spare Parts");
        stage.show();
        stage.setResizable(false);
    }

    public void reportButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ReportForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("View Reports");
        stage.show();
        stage.setResizable(false);
    }

    public void placeOrderButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/PlaceOrderForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Place an Oder");
        stage.show();
        stage.setResizable(false);
    }

    public void statusButtonOnAction(ActionEvent actionEvent) {

        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ChangeStatusForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);
    }

    public void addPartsButtonOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) lbtlDateAndTime.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AddPartsForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Admin Dash Board");
        stage.show();
        stage.setResizable(false);


    }
}
