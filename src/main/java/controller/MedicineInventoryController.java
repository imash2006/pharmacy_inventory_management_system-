package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.dto.Dashboard;
import model.dto.MedicineInventory;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class MedicineInventoryController implements Initializable {

    ObservableList<MedicineInventory> inventory = FXCollections.observableArrayList(

    );

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
    private TableView<MedicineInventory> tblInventiryOverview;

    @FXML
    public TableColumn medicineid;

    @FXML
    public TableColumn medicinecategory;

    @FXML
    public TableColumn medicinename;

    @FXML
    public TableColumn medicineexpirydate;

    @FXML
    public TableColumn medicinequantity;

    @FXML
    public TableColumn medicineprice;

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

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthy_life_pharmacy","root","1234");
            String SQL = "select*from inventory_overview";
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            inventory.clear();

            while (resultSet.next()){
                MedicineInventory medicine = new MedicineInventory(
                        resultSet.getString("MedicineID"),
                        resultSet.getString("Category"),
                        resultSet.getString("Name"),
                        resultSet.getString("Expiry_date"),
                        resultSet.getString("Quantity"),
                        resultSet.getString("Price")
                );
                inventory.add(medicine);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        medicineid.setCellValueFactory(new PropertyValueFactory<>("medicineid"));
        medicinecategory.setCellValueFactory(new PropertyValueFactory<>("medicinecategory"));
        medicinename.setCellValueFactory(new PropertyValueFactory<>("medicinename"));
        medicineexpirydate.setCellValueFactory(new PropertyValueFactory<>("medicineexpirydate"));
        medicinequantity.setCellValueFactory(new PropertyValueFactory<>("medicinequantity"));
        medicineprice.setCellValueFactory(new PropertyValueFactory<>("medicineprice"));

        tblInventiryOverview.setItems(inventory);

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthy_life_pharmacy","root","1234");
            String SQL = "select*from inventory_overview";
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            inventory.clear();

            while (resultSet.next()){
                MedicineInventory medicine = new MedicineInventory(
                        resultSet.getString("MedicineID"),
                        resultSet.getString("Category"),
                        resultSet.getString("Name"),
                        resultSet.getString("Expiry_date"),
                        resultSet.getString("Quantity"),
                        resultSet.getString("Price")
                );
                inventory.add(medicine);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        medicineid.setCellValueFactory(new PropertyValueFactory<>("medicineid"));
        medicinecategory.setCellValueFactory(new PropertyValueFactory<>("medicinecategory"));
        medicinename.setCellValueFactory(new PropertyValueFactory<>("medicinename"));
        medicineexpirydate.setCellValueFactory(new PropertyValueFactory<>("medicineexpirydate"));
        medicinequantity.setCellValueFactory(new PropertyValueFactory<>("medicinequantity"));
        medicineprice.setCellValueFactory(new PropertyValueFactory<>("medicineprice"));

        tblInventiryOverview.setItems(inventory);
    }
}
