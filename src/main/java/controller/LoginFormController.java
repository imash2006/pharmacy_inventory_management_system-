package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFormController {

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private TextField txtusername;

    @FXML
    void btnloginOnAction(ActionEvent event) {
        String username = "admin";
        String passworde = "1234";
        String input1 = txtusername.getText();
        String onput2 = txtpassword.getText();
        if (input1 == username){

        }else {

        }
    }

}
