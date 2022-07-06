/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Alex
 */
public class Users {
    private int idUser;
    private String nomUser;

    
    public Users(int unId, String unNom){
        this.idUser = unId;
        this.nomUser = unNom;
        /*this.prenomUser = unPrenom;
        this.statUser = unStat;*/
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the nomUser
     */
    public String getNomUser() {
        return nomUser;
    }

    /**
     * @param nomUser the nomUser to set
     */
    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }
    



}
