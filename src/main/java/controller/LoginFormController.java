package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private TextField txtusername;


    Stage stage = new Stage();
    @FXML
    public void btnloginOnAction(ActionEvent actionEvent) {
        String username = "admin";
        String password = "1234";
        String input1 = txtusername.getText();
        String input2 = txtpassword.getText();

        if (input1.equals(username)){
            if (input2.equals(password)){
                try {
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));

                    Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    currentStage.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else {
                try {
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/wrong_input.fxml"))));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }else {
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/wrong_input.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        stage.show();
    }

    public void setOnAction(ActionEvent actionEvent) {
        txtusername.setOnAction(e -> txtpassword.requestFocus());
        txtpassword.setOnAction(e -> btnlogin.requestFocus());
    }
}
