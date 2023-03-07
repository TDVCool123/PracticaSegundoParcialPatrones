module com.example.practicasegundoparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicasegundoparcial to javafx.fxml;
    exports com.example.practicasegundoparcial;
}