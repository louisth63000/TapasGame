/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tapas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

/**
 *
 * @author easy
 */
public class FXMLControllerT implements Initializable {
    
    @FXML
    private Label label1;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
 
    } 
      public void myFunction(String test1)
    {
        label1.setText(""+test1);
    }
}
