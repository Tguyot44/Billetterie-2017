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
import View.JFrameReservation;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author qbaudry
 */
public class CtrlLesRepresentations implements WindowListener, MouseListener {

    private JFrameMenu vue = new JFrameMenu(); // LA VUE
    private List<Representation> lesRepresentations = null;
    
    public CtrlLesRepresentations() {
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjTableRepresentation().addMouseListener(this);
        // préparer l'état initial de la vue
        try {
            lesRepresentations = RepresentationDAO.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesRepresentations - échec de sélection des Representations");
        }
        afficherLesRepresentations();

    }

    // contrôle de la vue
    /**
     * Remplir le composant JTable avec les Representations
     *
     * @param desRepresentations liste des adresses à afficher
     */
    private final void afficherLesRepresentations() {
        getVue().getModeleTableRepresentation().setRowCount(0);
        String[] titresColonnes = {"DATE", "GROUPE", "LIEU", "DEBUT", "FIN", "PLACE"};
        getVue().getModeleTableRepresentation().setColumnIdentifiers(titresColonnes);

        String[] ligneDonnees = new String[6];

        for (Representation uneRepresentation : lesRepresentations) {
            ligneDonnees[0] = uneRepresentation.getDateRep().toString();
            ligneDonnees[1] = uneRepresentation.getGroupe().getNomGroup();
            ligneDonnees[2] = uneRepresentation.getLieu().getNomLieu();
            ligneDonnees[3] = uneRepresentation.getHeureDebut().toString();
            ligneDonnees[4] = uneRepresentation.getHeureFin().toString();
            ligneDonnees[5] = uneRepresentation.getNbPlace() + "";
            getVue().getModeleTableRepresentation().addRow(ligneDonnees);
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
        CtrlPrincipal ctrl = new CtrlPrincipal();
        int row = vue.getjTableRepresentation().getSelectedRow();
        ctrl.showReservation(lesRepresentations.get(row).getIdRep());
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
