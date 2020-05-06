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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tools.DatabaseLinkers;

/**
 *
 * @author utilisateur
 */
public class CommandeManager {
        public static Commande findCommande(int idCommande)
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
                commande.setIdTable(result.getInt("idTable"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      return commande;
    }
    public static ArrayList<Commande> findAllCommande()
    {
        ArrayList<Commande> listCommande=null;
        Connection co = DatabaseLinkers.getConnexion();
        PreparedStatement state;
            try {
                state = co.prepareStatement("SELECT * FROM Commande");
                ResultSet result=state.executeQuery();
                while(result.next())
                {
                   Commande commande=new Commande();
                   commande=findCommande(result.getInt("idCommande"));
                   listCommande.add(commande);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CommandeManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return listCommande;
    }
    
    public static ArrayList<Commande> findAllCommandetoTable(int idTable)
    {
        ArrayList<Commande> listCommande=null;
        Connection co = DatabaseLinkers.getConnexion();
        PreparedStatement state;
            try {
                state = co.prepareStatement("SELECT * FROM Commande WHERE idTable=?");
                state.setInt(1, idTable);
                ResultSet result=state.executeQuery();
                while(result.next())
                {
                   Commande commande=new Commande();
                   commande=findCommande(result.getInt("idCommande"));
                   listCommande.add(commande);
                }
            } catch (SQLException ex) {
                Logger.getLogger(CommandeManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return listCommande;
    }
}   
