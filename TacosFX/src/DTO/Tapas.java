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
public class Tapas {
    private int idTapas;
    private String nomTapas;
    private int idCommande;
    private int idCategorie;

    public int getIdTapas() {
        return idTapas;
    }

    public void setIdTapas(int idTapas) {
        this.idTapas = idTapas;
    }

    public String getNomTapas() {
        return nomTapas;
    }

    public void setNomTapas(String nomTapas) {
        this.nomTapas = nomTapas;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }
    
}
