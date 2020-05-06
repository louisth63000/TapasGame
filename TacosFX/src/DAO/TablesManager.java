/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Tables;
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
public class TablesManager {
    public static Tables findTables(int idTables)
    {
        Tables table= null;
        Connection co =DatabaseLinkers.getConnexion();
        PreparedStatement state;
        try {
            state = co.prepareStatement("SELECT * FROM Tables WHERE idTable=?");
            state.setInt(1, idTables);
            ResultSet result=state.executeQuery();
            if(result.next())
            {
                table=new Tables();
                table.setIdTables(idTables);
                table.setIdCommande(result.getInt("idCommande"));
                table.setNombrePersonne(result.getInt("nombrePersonne"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TablesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      return table;
    }
}
