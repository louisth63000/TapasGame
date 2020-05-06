/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author utilisateur
 */
public class DatabaseLinkers {
    	private static String URL="jdbc:mysql://localhost:3306/bdd_tapas?serverTimezone=UTC";
	private static String nomUtilisateurs="root";
	private static String mdp="root";
        private static Connection conn = null;

	public static Connection getConnexion()
	{
		try 
		{
			if (conn == null)
			{
				conn = DriverManager.getConnection(URL,nomUtilisateurs,mdp);
			}	 
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return conn;
	}	  
    
}
