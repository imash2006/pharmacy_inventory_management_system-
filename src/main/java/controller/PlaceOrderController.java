package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

public class PlaceOrderController {

    @FXML
    private Button btnDownloadBill;

    @FXML
    private BorderPane idBillPrint;

    @FXML
    private Label idTotalPrice;

    @FXML
    private TableView<?> tblbill;

    @FXML
    void btnDownloadBillOnAction(ActionEvent event) {

    }

}
