/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.Jdbc;
import View.*;
import Controller.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author qbaudry
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "btssio", "btssio");
        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql:", "//localhost/", "festival", "festival", "secret");
        try {
            Jdbc.getInstance().connecter();
            JFrameMenu uneVue = new JFrameMenu();
            CtrlLesRepresentations unControleur = new CtrlLesRepresentations(uneVue);
            // afficher la vue
            uneVue.setVisible(true);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Main - classe JDBC non trouvée");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Main - échec de connexion");
        }
    }
}
