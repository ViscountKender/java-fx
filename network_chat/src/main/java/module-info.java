module ru.gb.siyanov.network_chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.siyanov.network_chat to javafx.fxml;
    exports ru.gb.siyanov.network_chat;
}