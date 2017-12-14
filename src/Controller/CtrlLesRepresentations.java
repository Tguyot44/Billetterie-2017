/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import DAO.RepresentationDAO;
import Metier.Representation;
import View.JFrameMenu;

/**
 *
 * @author qbaudry
 */

public class CtrlLesRepresentations implements WindowListener {
    
     private JFrameMenu vue; // LA VUE
     
     public CtrlLesRepresentations(JFrameMenu vue) {
        
        this.vue = vue;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        // préparer l'état initial de la vue
        List<Representation> lesRepresentations = null;
        try {
            lesRepresentations = RepresentationDAO.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesRepresentations - échec de sélection des Representations");
        }
        afficherLesRepresentations(lesRepresentations);
        
    }
     
    // contrôle de la vue
    /**
     * Remplir le composant JTable avec les Representations
     *
     * @param desRepresentations liste des adresses à afficher
     */
    private final void afficherLesRepresentations(List<Representation> desRepresentations) {
        getVue().getModeleTableRepresentation().setRowCount(0);
        String[] titresColonnes = {"DATE", "HEURE DEBUT", "HEURE FIN"};
        getVue().getModeleTableRepresentation().setColumnIdentifiers(titresColonnes);
        
        DateFormat DF = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat TF = new SimpleDateFormat("HH:mm");
        
        String[] ligneDonnees = new String[3];
        for (Representation uneRepresentation : desRepresentations) {
            ligneDonnees[0] = DF.format(uneRepresentation.getDateRep());
            ligneDonnees[1] = TF.format(uneRepresentation.getHeureDebut());
            ligneDonnees[2] = TF.format(uneRepresentation.getHeureFin());
            getVue().getModeleTableRepresentation().addRow(ligneDonnees);            
        }       
    }
    
    /**
     * Quitter l'application, après demande de confirmation
     */
    private void quitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "AGENCEB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }
    }
    
    // ACCESSEURS et MUTATEURS
    public JFrameMenu getVue() {
        return vue;
    }
    
    public void setVue(JFrameMenu vue) {
        this.vue = vue;
    }

    @Override
    public void windowOpened(WindowEvent e) {
       }

    @Override
    public void windowClosing(WindowEvent e) {
        quitter();
        }

    @Override
    public void windowClosed(WindowEvent e) {
        }

    @Override
    public void windowIconified(WindowEvent e) {
        }

    @Override
    public void windowDeiconified(WindowEvent e) {
        }

    @Override
    public void windowActivated(WindowEvent e) {
        }

    @Override
    public void windowDeactivated(WindowEvent e) {
        }

}
