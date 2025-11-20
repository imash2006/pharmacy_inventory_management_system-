package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CashierDashboardController {

    @FXML
    public AnchorPane idMainPane2;

    @FXML
    public AnchorPane idMainPane;

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnDashboard;

    @FXML
    private ImageView btnLogout;

    @FXML
    private Button btnMedicines;

    @FXML
    private Button btnNotification;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnPlaceOrder;

    @FXML
    private Button btnPointOfSale;

    @FXML
    private Button btnSupplier;

    @FXML
    private Button btnViewItemTable;

    @FXML
    private Button btnlogout;

    @FXML
    private Label idCategory;

    @FXML
    private Label idDate;

    @FXML
    private Label idExpiringSoon;

    @FXML
    private Label idExpiryDate;

    @FXML
    private Label idLowStockItems;

    @FXML
    private Label idName;

    @FXML
    private ImageView idNotificationBell;

    @FXML
    private Label idPrice;

    @FXML
    private Label idTime;

    @FXML
    private Label idTodaysSales;

    @FXML
    private Label idTotalNotifications;

    @FXML
    private TableView<?> tdlCartItemList;

    @FXML
    private TextField txtMedicineId;

    @FXML
    private TextField txtQuantity;

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

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
    void btnLogoutOnAction(MouseEvent event) {

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
    void btnOrderOnAction(ActionEvent event) {
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
    void btnPlaceOrderOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/place_order.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
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
    void btnSupplierOnAction(ActionEvent event) {
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

    @FXML
    void btnViewItemTableOnAction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/item_tabl_view.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    Stage stage = new Stage();
    @FXML
    void btnlogoutOnAction(ActionEvent event) {
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
    void tblCartItemList(ActionEvent event) {

    }

}
