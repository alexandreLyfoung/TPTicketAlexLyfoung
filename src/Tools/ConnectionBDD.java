/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class ConnectionBDD {
    private static Connection cnx;
    
    public ConnectionBDD()
    {
        try
        {
            String pilote = "com.mysql.jdbc.Driver";
            // chargement du pilote
            Class.forName(pilote);
            // L'objet connexion à la BDD avec le nom de la base, le user et le password
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/tickets?serverTimezone="
                    + TimeZone.getDefault().getID(), "root", "");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public static Connection getCnx() {
        return cnx;
    }
}
