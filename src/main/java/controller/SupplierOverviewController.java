package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierOverviewController {

    @FXML
    public AnchorPane idMainPane2;

    @FXML
    public AnchorPane idMainPane;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnFilter;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMedicines;

    @FXML
    private Button btnNotification;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnPointOfSale;

    @FXML
    private Button btnSuppliers;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btndelete;

    @FXML
    private Label idDate;

    @FXML
    private Label idExpiringSoon;

    @FXML
    private Label idLowStockItem;

    @FXML
    private Label idTme;

    @FXML
    private Label idTodaysSales;

    @FXML
    private Label idTotalMedicines;

    @FXML
    private ImageView imgnotificationBell;

    @FXML
    private TableView<?> tblSupplierDetails;

    @FXML
    private TextArea txtSupplierAddress;

    @FXML
    private TextField txtSupplierContact;

    @FXML
    private TextField txtSupplierContactFilter;

    @FXML
    private TextField txtSupplierEmail;

    @FXML
    private TextField txtSupplierIdFilter;

    @FXML
    private TextField txtSupplierName;

    @FXML
    private TextField txtSupplierNameFilter;

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
    void btnMedicinesOnAction(ActionEvent event) {
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
    void btnSuppplierOnAction(ActionEvent event) {
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
    void btnUpdateOnAction(ActionEvent event) {

    }

}
