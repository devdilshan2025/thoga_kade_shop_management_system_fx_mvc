package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    Stage customerManagement = new Stage();
    Stage itemManagement = new Stage();
    Stage placeOrderManagement = new Stage();
    Stage orderDetailManagement = new Stage();


    @FXML
    private Button btnCustomerManegement;

    @FXML
    private Button btnItemManegement;

    @FXML
    private Button btnOrderdetailManagement;

    @FXML
    private Button btnPlaceorderManagement;

    @FXML
    void btnCustomerManegementOnAction(ActionEvent event) {
        try {
            customerManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customerManegement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        customerManagement.show();

    }

    @FXML
    void btnItemManegementOnAction(ActionEvent event) {
        try {
            itemManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ItemManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        itemManagement.show();

    }

    @FXML
    void btnOrderdetailManagementOnAction(ActionEvent event) {
        try {
            orderDetailManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/orderDetail.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderDetailManagement.show();

    }

    @FXML
    void btnPlaceorderManagementOnAction(ActionEvent event) {
        try {
            placeOrderManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/placeOrderManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        placeOrderManagement.show();

    }

}
