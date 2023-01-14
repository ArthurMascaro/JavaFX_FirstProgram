package com.example.javafxtasks;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class HelloController {

    @FXML
    TextField descTextField;
    @FXML
    TextField valueTextField;
    @FXML
    DatePicker datePicker;
    @FXML
    Button save;
    @FXML
    ComboBox categoryComboBox;

    @FXML
    public void initialize() {
        categoryComboBox.getItems().removeAll(categoryComboBox.getItems());
        categoryComboBox.getItems().addAll(Product.Category.values());
        categoryComboBox.getSelectionModel();
    }

    public void save(){
        String description = descTextField.getText();
        Double value = Double.parseDouble(valueTextField.getText());
        LocalDate date = datePicker.getValue();
        var categoria = (Product.Category) categoryComboBox.getValue();
        Product product = new Product(description, date, value, categoria);
        System.out.println(product);
    }

}