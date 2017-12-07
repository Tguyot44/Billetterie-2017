package TestDAO;

import java.sql.*;
import java.util.List;
import DAO.LieuDAO;
import DAO.Jdbc;
import Metier.Lieu;

/**
 *
 * @author btssio
 */
public class TestLieuDAO{

    public static void main(String[] args) {

        java.sql.Connection cnx = null;

        try {
            test0_Connexion();
            System.out.println("Test0 effectué : connexion\n");
            test1_SelectOne(1);
            System.out.println("Test1 effectué : sélection unique\n");
            test2_SelectAll();
            System.out.println("Test2 effectué : sélection multiple\n");
            test3_Update(99);
            System.out.println("Test3 effectué : mise à jour\n");

        } catch (ClassNotFoundException e) {
            System.err.println("Erreur de pilote JDBC : " + e);
        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e);
        } finally {
            try {
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                System.err.println("Erreur de fermeture de la connexion JDBC : " + e);
            }
        }

    }

    /**
     * Vérifie qu'une connexion peut être ouverte sur le SGBD
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql://", "localhost/", "AGENCEB", "agenceb_util", "secret");
//        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "btssio", "btssio");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }

    /**
     * Affiche une lieu d'après son identifiant
     * @throws SQLException
     */
    public static void test1_SelectOne(int idLieu) throws SQLException {
        Lieu cetteLieu = LieuDAO.selectOne(idLieu);
        System.out.println("Lieu d'identifiant : "+idLieu+" : "+cetteLieu.toString());
    }

    /**
     * Affiche toutes les villes
     * @throws SQLException
     */
    public static void test2_SelectAll() throws SQLException {
        List<Lieu> desLieus = LieuDAO.selectAll();
        System.out.println("Les lieus lues : "+desLieus.toString());
    }

    /**
     * Modifie une lieu
     * @throws SQLException
     */
    public static void test3_Update(int idLieu) throws SQLException {
         Lieu unLieu = new Lieu(1, 'La Moria', 'Rue Jean-Michel',200000);
        int nb= LieuDAO.update(idLieu, unLieu);
        System.out.println("Une lieu a été modifiée: "+nb);
        test1_SelectOne(idLieu);
    }

}

