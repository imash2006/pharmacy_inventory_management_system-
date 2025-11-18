package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ItemTableViewController {

    @FXML
    private Button btnFilter;

    @FXML
    private ComboBox<?> comCategoryFilter;

    @FXML
    private TableView<?> tblMedicineInventory;

    @FXML
    private TextField txtMedicineFilter;

    @FXML
    private TextField txtNameFilter;

    @FXML
    void btnFilterOnAction(ActionEvent event) {

    }

}
