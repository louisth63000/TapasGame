/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author utilisateur
 */
public class Commande {
    private int idCommande;
    private String heure;
    private int idTapas;

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }


    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getIdTapas() {
        return idTapas;
    }

    public void setIdTapas(int idTapas) {
        this.idTapas = idTapas;
    }
    
}
