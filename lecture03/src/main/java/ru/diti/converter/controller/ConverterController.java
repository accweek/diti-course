package ru.diti.converter.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

import javafx.scene.control.TextField;
import ru.diti.converter.enums.Currency;
import ru.diti.converter.service.ConverterService;

public class ConverterController {
    private final ConverterService converterService = new ConverterService();

    @FXML
    private Text actiontarget;

    @FXML
    private TextField money;

    @FXML
    private ComboBox<Currency> currencyFrom;

    @FXML
    private ComboBox<Currency> currencyTo;

    public void handleConvertButtonAction(ActionEvent actionEvent) {
        validate();
        actiontarget.setText(money.getText());
    }

    //If value is not number, show error message.
    //If value is negative, show error
    private void validate() {

    }
}
