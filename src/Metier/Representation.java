/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.Date;

/**
 *
 * @author qbaudry
 */

public class Representation {
    
    private int idRep;
    private Date dateRep;
    private String leLieu;
    private String leGroupe;
    private String heureDebut;
    private String heureFin;
    
    public Representation(int idRep, Date dateRep, String leLieu, String leGroupe, String heureDebut, String heureFin) {
        this.idRep = idRep;
        this.dateRep = dateRep;
        this.leLieu = leLieu;
        this.leGroupe = leGroupe;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;

    }

    @Override
    public String toString() {
        return "Representation{" + "id=" + idRep + ", date=" + dateRep + ", lieu=" + leLieu + ", groupe=" + leGroupe + ", heure_debut=" + heureDebut + ", heure_fin=" + heureFin + '}';
    }

    public int getIdRep() {
        return idRep;
    }

    public void setIdRep(int idRep) {
        this.idRep = idRep;
    }

    public Date getDateRep() {
        return dateRep;
    }

    public void setDateRep(Date dateRep) {
        this.dateRep = dateRep;
    }

    public String getLeLieu() {
        return leLieu;
    }

    public void setLeLieu(String leLieu) {
        this.leLieu = leLieu;
    }

    public String getLeGroupe() {
        return leGroupe;
    }

    public void setLeGroupe(String leGroupe) {
        this.leGroupe = leGroupe;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }
    
}