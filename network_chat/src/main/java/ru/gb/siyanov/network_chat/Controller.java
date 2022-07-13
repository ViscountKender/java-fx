package ru.gb.siyanov.network_chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea historyArea;
    @FXML
    private TextField userBoard;

    public void clickCheckButton(ActionEvent actionEvent) {
        final String userText = userBoard.getText();
        if(userText.isBlank()){
            return;
        }
        historyArea.appendText(userText + "\n");
        userBoard.clear();
        userBoard.requestFocus();


    }
}