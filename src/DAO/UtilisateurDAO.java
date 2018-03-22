/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Properties.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author tguyot
 */
public class UtilisateurDAO {
    
    public static void LogIn (String log ,String pswd) {
        String login = log;
        String passwrd = pswd;
    try (Connection conn = DriverManager.getConnection(Reader.readString("BDD_url"), Reader.readString("BDD_login"), Reader.readString("BDD_mdp"));
                Statement stmt = conn.createStatement();) {
                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `Utilisateur` WHERE `Login` LIKE \""+login+"\"AND `Password` LIKE \""+passwrd+"\" ");
        } catch (Exception e) {
            throw new java.lang.Error("Failed To Execute Statement: \n\r"+e);
        }
    }
}
