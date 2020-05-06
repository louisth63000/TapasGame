/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author utilisateur
 */
public class FXMLController implements Initializable {
    
    ImageView image;
    Text text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       Image imageaccueil = new Image(getClass().getResourceAsStream("/image/accueil.jpg"));
       text.setText("essai");
    }    
    
}
