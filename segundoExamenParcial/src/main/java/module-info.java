module com.example.segundoexamenparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.segundoexamenparcial to javafx.fxml;
    exports com.example.segundoexamenparcial;
}