/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Alex
 */
public class Tickets {
    private int idTicket;
    private String nomTicket;
    private String dateTicket;
    private int numEtat;
    
    public Tickets(int unId, String unNom, String uneDate, int unEtat)
    {
        this.idTicket = unId;
        this.nomTicket = unNom;
        this.dateTicket = uneDate;
        this.numEtat = unEtat;
    }

    /**
     * @return the idTicket
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * @param idTicket the idTicket to set
     */
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    /**
     * @return the nomTicket
     */
    public String getNomTicket() {
        return nomTicket;
    }

    /**
     * @param nomTicket the nomTicket to set
     */
    public void setNomTicket(String nomTicket) {
        this.nomTicket = nomTicket;
    }

    /**
     * @return the dateTicket
     */
    public String getDateTicket() {
        return dateTicket;
    }

    /**
     * @param dateTicket the dateTicket to set
     */
    public void setDateTicket(String dateTicket) {
        this.dateTicket = dateTicket;
    }

    /**
     * @return the numEtat
     */
    public int getNumEtat() {
        return numEtat;
    }

    /**
     * @param numEtat the numEtat to set
     */
    public void setNumEtat(int numEtat) {
        this.numEtat = numEtat;
    }
    
}
