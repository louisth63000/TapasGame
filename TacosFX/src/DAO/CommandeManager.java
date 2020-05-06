/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Commande;
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
public class CommandeManager {
        public static Commande findTables(int idCommande)
    {
        Commande commande= null;
        Connection co =DatabaseLinkers.getConnexion();
        PreparedStatement state;
        try {
            state = co.prepareStatement("SELECT * FROM Commande WHERE idCommande=?");
            state.setInt(1, idCommande);
            ResultSet result=state.executeQuery();
            if(result.next())
            {
                commande=new Commande();
                commande.setIdCommande(idCommande);
                commande.setHeure(result.getString("heure"));
                commande.setIdTapas(result.getInt("nombrePersonne"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      return commande;
    }
}
