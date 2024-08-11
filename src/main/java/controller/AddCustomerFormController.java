package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtId;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtSalary;

    List<Customer> customerList = new ArrayList<>();
    @FXML
    void btnAddCustomerOnAction() {
        customerList.add(new Customer(
                txtId.getText(),
                txtName.getText(),
                txtAddress.getText(),
                Double.parseDouble(txtSalary.getText())
        )
        );
        System.out.println("----------------------------");
        customerList.forEach(obj->{
            System.out.println(obj);
        });
        System.out.println("----------------------------");
        clearTxt();
    }

    public void btnClearOnAction() {
        clearTxt();
    }
    private void clearTxt(){
        txtId.clear();
        txtName.clear();
        txtAddress.clear();
        txtSalary.clear();
    }
}
