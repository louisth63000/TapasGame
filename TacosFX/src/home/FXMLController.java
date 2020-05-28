/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import Tapas.FXMLControllerT;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author utilisateur
 */
public class FXMLController implements Initializable {
    
    @FXML
    ImageView imageaccueil;
    
    @FXML       
    TextField text1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       Image image = new Image(getClass().getResourceAsStream("/image/accueil.jpg"));
       imageaccueil.setImage(image);
    }    
    
    @FXML
    private void ButtonAction(ActionEvent event) throws IOException
    {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/Tapas/FXML.fxml"));
        Parent root= (Parent) loader.load();
        FXMLControllerT secController=loader.getController();
        secController.myFunction(text1.getText());
        Stage stage=new Stage();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
