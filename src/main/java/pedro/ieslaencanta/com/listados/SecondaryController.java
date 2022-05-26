package pedro.ieslaencanta.com.listados;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pedro.ieslaencanta.com.listados.model.Category;
import pedro.ieslaencanta.com.listados.model.Principal;

public class SecondaryController implements Initializable {
    private Category c;
    @FXML
    private TextField nombre;
    @FXML
    private Button enviar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @FXML
    private void actualizar(MouseEvent event) {
        c.setName(nombre.getText());
    }

    public Category getC() {
        return c;
    }

    public void setC(Category c) {
        this.c = c;
        this.nombre.setText(this.c.getName());
    }


   
   

    
}