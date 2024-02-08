package controller;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AddPartsFormController {
    public JFXTreeTableView usedPartsTable;
    public JFXTreeTableView allPartTable;
    public JFXTextField txtSearch;

    public void saveButtonOnAction(ActionEvent actionEvent) {
    }

    public void searchButtonOnAction(ActionEvent actionEvent) {
    }

    public void backButtomOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage) allPartTable.getScene().getWindow();
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
