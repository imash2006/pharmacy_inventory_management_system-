package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.dto.Dashboard;

import java.io.IOException;
import java.sql.*;

public class DashboardController {
    ObservableList<Dashboard>dashboards = FXCollections.observableArrayList(

    );

    @FXML
    public GridPane idDashboardGridPane;

    @FXML
    public AnchorPane idMainPane;

    @FXML
    public AnchorPane idMainPane2;

    @FXML
    public TableColumn dashboardid;

    @FXML
    public TableColumn dashboardcategory;

    @FXML
    public TableColumn dashboardname;

    @FXML
    public TableColumn dashboardexpirydate;

    @FXML
    public TableColumn dashboardquantity;

    @FXML
    public TableColumn dashboardprice;

    @FXML
    private Button btnDashboard;

    @FXML
    private Label btnExpiringSoon;

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
    private Button btnSupplier;

    @FXML
    private Label btnTodaysSales;

    @FXML
    private Label idDate;

    @FXML
    private ImageView idExpiryAlert;

    @FXML
    private ImageView idLowStock;

    @FXML
    private Label idLowStockItems;

    @FXML
    private ImageView idNotificationBell;

    @FXML
    private ImageView idSupplierUpdate;

    @FXML
    private Label idTime;

    @FXML
    private Label idTotalMedicines;

    @FXML
    private TableView<Dashboard> tblInventoryOverview;

    Stage stage = new Stage();
    @FXML
    void btnDashboardOnAction(ActionEvent event) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthy_life_pharmacy","root","1234");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT*FROM inventory_overview");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        dashboardid.setCellValueFactory(new PropertyValueFactory<>("medicineid"));
        dashboardcategory.setCellValueFactory(new PropertyValueFactory<>("medicinecategory"));
        dashboardname.setCellValueFactory(new PropertyValueFactory<>("medicinename"));
        dashboardexpirydate.setCellValueFactory(new PropertyValueFactory<>("medicineexpirydate"));
        dashboardquantity.setCellValueFactory(new PropertyValueFactory<>("medicinequantity"));
        dashboardprice.setCellValueFactory(new PropertyValueFactory<>("medicineprice"));

        tblInventoryOverview.setItems(dashboards);
    }

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

}
