// Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
// Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
// Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
// При «отсылке» сообщение перекидывается из нижнего поля в центральное.
package ru.gb.siyanov.network_chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NetworkChat extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NetworkChat.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 440);
        stage.setTitle("NetworkChat!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}