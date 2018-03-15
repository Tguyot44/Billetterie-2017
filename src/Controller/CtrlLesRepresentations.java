/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import DAO.RepresentationDAO;
import Metier.Representation;
import View.JFrameMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author qbaudry
 */

public class CtrlLesRepresentations implements WindowListener, MouseListener {
    
     private JFrameMenu vue; // LA VUE
     
     public CtrlLesRepresentations(JFrameMenu vue) {
        
        this.vue = vue;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjTableRepresentation().addMouseListener(this);
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
        String[] titresColonnes = {"DATE", "GROUPE", "LIEU", "DEBUT", "FIN", "PLACE"};
        getVue().getModeleTableRepresentation().setColumnIdentifiers(titresColonnes);
        
        String[] ligneDonnees = new String[6];
        
        for (Representation uneRepresentation : desRepresentations) {
            ligneDonnees[0] = uneRepresentation.getDateRep().toString();
            ligneDonnees[1] = uneRepresentation.getGroupe().getNomGroup();
            ligneDonnees[2] = uneRepresentation.getLieu().getNomLieu();
            ligneDonnees[3] = uneRepresentation.getHeureDebut().toString();
            ligneDonnees[4] = uneRepresentation.getHeureFin().toString();
            ligneDonnees[5] = uneRepresentation.getNbPlace()+"";
            getVue().getModeleTableRepresentation().addRow(ligneDonnees);            
        }       
    }
    
    /**
     * Quitter l'application, après demande de confirmation
     */
    private void quitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "festival", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        int row = vue.getjTableRepresentation().getSelectedRow();
        String groupeChoisis = (String) vue.getjTableRepresentation().getValueAt(row, 1);
        String lieuChoisis = (String) vue.getjTableRepresentation().getValueAt(row, 2);
        String nbPlace = (String) vue.getjTableRepresentation().getValueAt(row, 5);
        int dialogResult = JOptionPane.showConfirmDialog (vue, "Il reste " + nbPlace + " places \nVoulez vous des places pour la représentation "+ groupeChoisis);
        if(dialogResult == JOptionPane.YES_OPTION){
          // Saving code here
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
