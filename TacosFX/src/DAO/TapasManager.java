/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Commande;
import DTO.Tapas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tools.DatabaseLinkers;

/**
 *
 * @author utilisateur
 */
public class TapasManager {
    public static Tapas findTapas(int idTapas)
    {
      Tapas tapas= null;
        Connection co =DatabaseLinkers.getConnexion();
        PreparedStatement state;
        try {
            state = co.prepareStatement("SELECT * FROM Tapas WHERE idTapas=?");
            state.setInt(1, idTapas);
            ResultSet result=state.executeQuery();
            if(result.next())
            {
                tapas=new Tapas();
                tapas.setIdTapas(idTapas);
                tapas.setIdCommande(result.getInt("idCommande"));
                tapas.setIdCategorie(result.getInt("idTable"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      return tapas;   
    }
}
