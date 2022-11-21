module com.example.online_shopping_system {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.online_shopping_system to javafx.fxml;
    exports com.example.online_shopping_system;
}