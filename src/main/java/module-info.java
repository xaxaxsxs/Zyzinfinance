module com.example.zyzinfinance {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zyzinfinance to javafx.fxml;
    exports com.example.zyzinfinance;
}