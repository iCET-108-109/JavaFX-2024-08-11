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
    void btnAddCustomerOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(id, name, address, salary);

        customerList.add(customer);
        System.out.println("----------------------------");
        customerList.forEach(obj->{
            System.out.println(obj);
        });
        System.out.println("----------------------------");
    }

}
