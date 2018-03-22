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
import View.JFrameAuthentification;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author qbaudry
 */
public class CtrlAuthentification implements WindowListener, ActionListener {

    private JFrameAuthentification vue = new JFrameAuthentification(); // LA VUE
    
    public CtrlAuthentification() {
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        
        JTextField jTextFieldLogin = new JTextField();
        JTextField jTextFieldMdp = new JTextField();
        JButton jButtonValider = new JButton("Valider");
        //Ajoute un listener : ici le listener est cette classe
        jButtonValider.addActionListener(this);

        
    }

    // ACCESSEURS et MUTATEURS
    public JFrameAuthentification getVue() {
        return vue;
    }

    public void setVue(JFrameAuthentification vue) {
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
    public void actionPerformed(ActionEvent e) {
        //ON recupere avec getText(); 
        String login = "test";
        //String mdp = jTextFieldMdp.getText();
        
        System.out.println(login);
    }
}