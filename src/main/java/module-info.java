module pedro.ieslaencanta.com.listados {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens pedro.ieslaencanta.com.listados to javafx.fxml;
    exports pedro.ieslaencanta.com.listados;
}
