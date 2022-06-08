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
    // Метод  считывания текста, введенного юзером
    public void clickCheckButton(ActionEvent actionEvent) {
        final String userText = userBoard.getText();
        if(userText.isBlank()){
            return;
        }
        // отсылает текс написаный юзером в центральное поле
        // с переносом строки
        historyArea.appendText(userText + "\n");
       // очищает панель ввода текста юзера
        userBoard.clear();
        // возвращает фокус на панель ввода юзера
        userBoard.requestFocus();


    }
}