/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author qbaudry
 */
public class Lieu {

    private String idLieu;
    private String nomLieu;
    private String adresseLieu;
    private int capaciteAccueil;
    
    
     public Lieu(String idLieu, String nomLieu, String adresseLieu, int capaciteAccueil) {
        this.idLieu = idLieu;
        this.nomLieu = nomLieu;
        this.adresseLieu = adresseLieu;
        this.capaciteAccueil = capaciteAccueil;

    }

    @Override
    public String toString() {
        return "Lieu{" + "id=" + idLieu + ", nom=" + nomLieu + ", adresse=" + adresseLieu + ", capaciteAccueil=" + capaciteAccueil + '}';
    }

    public String getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(String idLieu) {
        this.idLieu = idLieu;
    }

    public String getNomLieu() {
        return nomLieu;
    }

    public void setNomLieu(String nomLieu) {
        this.nomLieu = nomLieu;
    }

    public String getAdresseLieu() {
        return adresseLieu;
    }

    public void setAdresseLieu(String adresseLieu) {
        this.adresseLieu = adresseLieu;
    }

    public int getCapaciteAccueil() {
        return capaciteAccueil;
    }

    public void setCapaciteAccueil(int capaciteAccueil) {
        this.capaciteAccueil = capaciteAccueil;
    }
    
}