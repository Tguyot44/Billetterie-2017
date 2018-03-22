/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tguyot
 */
public class CtrlPrincipal implements WindowListener, ActionListener {
    
    int idrep;
    
    CtrlLesRepresentations ctrlrep;
    CtrlReservation ctrlres;

    public void showRepresentation() {
        ctrlrep = new CtrlLesRepresentations();
        ctrlrep.getVue().setVisible(true);
    }
    public void hideRepresentation(){
        ctrlrep.getVue().setVisible(false);
    }
    public void showReservation(int id) {
        ctrlres = new CtrlReservation(id);
        ctrlres.getVue().setVisible(true);
    }
    public void hideReservation(){
        ctrlres.getVue().setVisible(false);
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
    public void actionPerformed(ActionEvent e) {
    }
}