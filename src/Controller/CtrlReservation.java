/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.JFrameReservation;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import Metier.Representation;
import DAO.RepresentationDAO;

/**
 *
 * @author tguyot
 */
public class CtrlReservation implements WindowListener, MouseListener {
    JFrameReservation vue = new JFrameReservation();
    
    public CtrlReservation(int id){
        Representation rep = RepresentationDAO.selectOne(id);
        vue.getjTextFieldGroupe().setText(rep.getGroupe().getNomGroup());
        vue.getjTextFieldLieu().setText(rep.getLieu().getNomLieu());
        vue.getjTextFieldDate().setText(rep.getDateRep().toString());
        vue.getjTextFieldHeureDebut().setText(rep.getHeureDebut().toString());
        vue.getjTextFieldHeureFin().setText(rep.getHeureFin().toString());
        vue.getjTextFieldNbPlaceTotal().setText(rep.getLieu().getCapaciteAccueil()+"");
        vue.getjTextFieldNbPlaceDispo().setText(rep.getNbPlace()+"");
        vue.getjTextFieldNbPlaceTotal().setText("");
    }
    
    public JFrameReservation getVue(){
        return vue;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
