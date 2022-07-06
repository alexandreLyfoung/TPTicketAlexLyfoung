/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Alex
 */
public class Etats {
    private int idEtat;
    private String nomEtat;
    
    public Etats(int unId, String unNom)
    {
        this.idEtat = unId;
        this.nomEtat = unNom;
    }

    /**
     * @return the idEtat
     */
    public int getIdEtat() {
        return idEtat;
    }

    /**
     * @param idEtat the idEtat to set
     */
    public void setIdEtat(int idEtat) {
        this.idEtat = idEtat;
    }

    /**
     * @return the nomEtat
     */
    public String getNomEtat() {
        return nomEtat;
    }

    /**
     * @param nomEtat the nomEtat to set
     */
    public void setNomEtat(String nomEtat) {
        this.nomEtat = nomEtat;
    }
}
