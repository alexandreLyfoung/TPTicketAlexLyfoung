/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entity.Tickets;
import Entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class FonctionsMetier {
    private Connection maCnx;
    private PreparedStatement ps;
    private ResultSet rsl;
    
    public FonctionsMetier()
    {
        this.maCnx = ConnectionBDD.getCnx();
    }
    
    
    //LOGIN FONCTIONS FRMPRINCIPAL
    public int ValidateLogin(String login, String pwd)
    {
        if (login.isEmpty() || login.isBlank())
        {
            return -1;
        }
        if (pwd.isBlank() || pwd.isEmpty())
        {
            return -2;
        }
        else
        {
            boolean loginValid = false;
            boolean pwdValid = false;
            try {
                ArrayList<String> mesLogins = new ArrayList<>();
                ArrayList<String> mesPwd = new ArrayList<>();
                ps = maCnx.prepareStatement("SELECT users.loginUser, users.pwdUser FROM users;");
                rsl = ps.executeQuery();
                while(rsl.next())
                {
                    String unLogin = rsl.getString(1);
                    String unPwd = rsl.getString(2);
                    mesLogins.add(unLogin);
                    mesPwd.add(unPwd);
                }
                for(int i = 0; i < mesLogins.size(); i++)
                {
                    if (mesLogins.get(i).equals(login))
                    {
                        loginValid=true;
                        if (mesPwd.get(i).equals(pwd))
                        {
                            pwdValid=true;
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(!loginValid)
            {
                return 1;
            }
            if (!pwdValid)
            {
                return 2;
            }
            else
            {
                return 0;
            }
        }
    }
    
    //FRM PRINCIPAL
    public String GetEtat(String login)
    {
        String unEtat = "";
        try {
                     
            ps = maCnx.prepareStatement("SELECT users.statutUser FROM users WHERE users.loginUser = '"+login+"';");
            rsl = ps.executeQuery();
            rsl.next();
            unEtat = rsl.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unEtat;
    }
    
    
    //FRM USER / FRM ADMIN
    public ArrayList<Users> GetAllUsers()
    {
        ArrayList<Users> mesUsers = new ArrayList<>();
        try {
                     
            ps = maCnx.prepareStatement("SELECT users.idUser, users.nomUser FROM users;");
            rsl = ps.executeQuery();
            while(rsl.next())
            {
                Users unUser = new Users(rsl.getInt(1), rsl.getString(2));
                mesUsers.add(unUser);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesUsers;
    }
    
    public ArrayList<Tickets> GetAllTicket(int idUser)
    {
        ArrayList<Tickets> mesTickets = new ArrayList<>();
        try {
                     
            ps = maCnx.prepareStatement("SELECT tickets.idTicket, tickets.nomTicket, tickets.dateTicket, tickets.numEtat FROM tickets WHERE tickets.numUser="+idUser+";");
            rsl = ps.executeQuery();
            while(rsl.next())
            {
                Tickets unTicket = new Tickets(rsl.getInt(1), rsl.getString(2), rsl.getString(3), rsl.getInt(4));
                mesTickets.add(unTicket);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesTickets;
    }       
    public String GetEtatTicket(int idEtat)
    {
        String unEtat = "";
        try {
                     
            ps = maCnx.prepareStatement("SELECT etats.nomEtat FROM etats WHERE etats.idEtat="+idEtat+";");
            rsl = ps.executeQuery();
            rsl.next();
            unEtat = rsl.getString(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unEtat;
    }
    
    public int GetMaxNumeroTicket()
    {
        int maxNumTicket = 0;
        try {
                     
            ps = maCnx.prepareStatement("SELECT MAX(tickets.idTicket) FROM tickets;");
            rsl = ps.executeQuery();
            rsl.next();
            maxNumTicket = rsl.getInt(1) + 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return maxNumTicket;
    }
    
    public void InsererTicket(int unNumero, String unNom, String unEtat, int idUser)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        try 
        {
            //String state = "SELECT etats.idEtat FROM etats WHERE etats.nomEtat=\'"+unEtat+"\';";
            
            //ps = maCnx.prepareStatement(state);
            //System.out.println("Tets");
            //rsl=ps.executeQuery();
            //System.out.println("Test1");
            //rsl.next();
            //System.out.println("Test2");
            //int idEtat = rsl.getInt(1);
            //System.out.println("Test3");
            int idEtat=0;
            switch(unEtat)
            {
                case "Bloquant":
                    idEtat = 1;
                    break;
                case "Majeur":
                    idEtat = 2;
                    break;
                case "Mineur":
                    idEtat = 3;
                    break;
                case "Terminé":
                    idEtat = 4;
                    break;
            }
            ps = maCnx.prepareStatement("INSERT INTO tickets(tickets.idTicket, tickets.nomTicket, tickets.dateTicket, tickets.numUser, tickets.numEtat) VALUES( "+unNumero+", '"+unNom+"', '"+format.format(today)+"',"+idUser+","+idEtat+");");
            ps.executeUpdate();            
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int GetIdUser(String login)
    {
        int idUser = 0;  
        try 
        {                     
            ps = maCnx.prepareStatement("SELECT users.idUser FROM users WHERE users.loginUser='"+login+"';");
            rsl = ps.executeQuery();
            rsl.next();
            idUser = rsl.getInt(1);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idUser;
    }
    
    
    
    public void ModifierEtatTicketUser(String newEtat, int idTicket)
    {
        try 
        {
            int idEtat = 0;
            switch(newEtat)
            {
                case "Bloquant":
                    idEtat = 1;
                    break;
                case "Majeur":
                    idEtat = 2;
                    break;
                case "Mineur":
                    idEtat = 3;
                    break;
                case "Terminé":
                    idEtat = 4;
                    break;
            }
            ps = maCnx.prepareStatement("UPDATE tickets SET tickets.numEtat="+ idEtat +" WHERE tickets.idTicket="+idTicket+";");
            ps.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
