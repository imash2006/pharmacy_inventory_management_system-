package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MedicineInventoryController {

    @FXML
    public AnchorPane idMainPane;

    @FXML
    public AnchorPane idMainPane2;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnFilter;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMedicine;

    @FXML
    private Button btnNotification;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnPointOfSale;

    @FXML
    private ComboBox<?> comCategory;

    @FXML
    private Label idDate;

    @FXML
    private Label idExpiringSoon;

    @FXML
    private Label idLowStockItems;

    @FXML
    private ImageView idNotificationBell;

    @FXML
    private Button idSupplier;

    @FXML
    private Label idTime;

    @FXML
    private Label idTodaysSales;

    @FXML
    private Label idTotalMedicines;

    @FXML
    private TableView<?> tblInventiryOverview;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtExpiryDate;

    @FXML
    private TextField txtMedicineIdFilter;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNameFilter;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtQuantity;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        idMainPane.getChildren().clear();

        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AnchorPane.setTopAnchor(newPane, 0.0);
        AnchorPane.setBottomAnchor(newPane, 0.0);
        AnchorPane.setLeftAnchor(newPane, 0.0);
        AnchorPane.setRightAnchor(newPane, 0.0);
        idMainPane2.getChildren().setAll(newPane);
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnFilterOnAction(ActionEvent event) {

    }

    Stage stage = new Stage();
    @FXML
    void btnLogoutOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void btnMedicineOnAction(ActionEvent event) {
        idMainPane.getChildren().clear();

        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("/view/medicine_inventory.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AnchorPane.setTopAnchor(newPane, 0.0);
        AnchorPane.setBottomAnchor(newPane, 0.0);
        AnchorPane.setLeftAnchor(newPane, 0.0);
        AnchorPane.setRightAnchor(newPane, 0.0);
        idMainPane2.getChildren().setAll(newPane);
    }

    @FXML
    void btnNotificationOnAction(ActionEvent event) {
        idMainPane.getChildren().clear();

        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("/view/notification_overview.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AnchorPane.setTopAnchor(newPane, 0.0);
        AnchorPane.setBottomAnchor(newPane, 0.0);
        AnchorPane.setLeftAnchor(newPane, 0.0);
        AnchorPane.setRightAnchor(newPane, 0.0);
        idMainPane2.getChildren().setAll(newPane);
    }

    @FXML
    void btnOrdersOnAction(ActionEvent event) {
        idMainPane.getChildren().clear();

        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("/view/order_details.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AnchorPane.setTopAnchor(newPane, 0.0);
        AnchorPane.setBottomAnchor(newPane, 0.0);
        AnchorPane.setLeftAnchor(newPane, 0.0);
        AnchorPane.setRightAnchor(newPane, 0.0);
        idMainPane2.getChildren().setAll(newPane);
    }

    @FXML
    void btnPointOfSaleOnAction(ActionEvent event) {
        idMainPane.getChildren().clear();

        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("/view/cashier_dashboard.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AnchorPane.setTopAnchor(newPane, 0.0);
        AnchorPane.setBottomAnchor(newPane, 0.0);
        AnchorPane.setLeftAnchor(newPane, 0.0);
        AnchorPane.setRightAnchor(newPane, 0.0);
        idMainPane2.getChildren().setAll(newPane);
    }

    @FXML
    void idSupplierOnAction(ActionEvent event) {
        idMainPane.getChildren().clear();

        AnchorPane newPane = null;
        try {
            newPane = FXMLLoader.load(getClass().getResource("/view/supplier_overview.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        AnchorPane.setTopAnchor(newPane, 0.0);
        AnchorPane.setBottomAnchor(newPane, 0.0);
        AnchorPane.setLeftAnchor(newPane, 0.0);
        AnchorPane.setRightAnchor(newPane, 0.0);
        idMainPane2.getChildren().setAll(newPane);
    }

}
