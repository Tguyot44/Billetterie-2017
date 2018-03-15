package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Metier.Representation;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import Metier.Lieu;
import Metier.Groupe;
import DAO.LieuDAO;
import DAO.GroupeDAO;

/**
 *
 * @author ttnguyen
 */
public class RepresentationDAO  {
    
    
    /**
    * Extraction d'une representation, sur son identifiant
    * @param idRepresentation identifiant
    * @return objet Representation
    * @throws SQLException 
    */
    public static Representation selectOne(String idRepresentation) throws SQLException {
        Representation uneRepresentation = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM Representation WHERE ID= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, idRepresentation);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("ID");
            LocalDate dateRep = rs.getDate("DATE_REP").toLocalDate();
            String leLieu = rs.getString("ID_LIEU");
            int idlieu = Integer.parseInt(leLieu);
            Lieu lieu = LieuDAO.selectOne(idlieu);
            String leGroupe = rs.getString("ID_GROUPE");
            Groupe groupe = GroupeDAO.selectOne(leGroupe);
            LocalTime heureDebut = rs.getTime("HEUREDEBUT").toLocalTime();
            LocalTime heureFin = rs.getTime("HEUREFIN").toLocalTime();
            
            uneRepresentation = new Representation(id, dateRep, lieu, groupe, heureDebut, heureFin, nbPlace);
        }
        return uneRepresentation;
    }
    
    /**
    * Extraction de toutes les representations
    * @return collection de representations
    * @throws SQLException 
    */
    public static List<Representation> selectAll() throws SQLException {
        List<Representation> lesRepresentations = new ArrayList<Representation>();
        Representation uneRepresentation;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM Representation";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("ID");
            LocalDate dateRep = rs.getDate("DATE_REP").toLocalDate();
            String leLieu = rs.getString("ID_LIEU");
            int idlieu = Integer.parseInt(leLieu);
            Lieu lieu = LieuDAO.selectOne(idlieu);
            String leGroupe = rs.getString("ID_GROUPE");
            Groupe groupe = GroupeDAO.selectOne(leGroupe);
            LocalTime heureDebut = rs.getTime("HEUREDEBUT").toLocalTime();
            LocalTime heureFin = rs.getTime("HEUREFIN").toLocalTime();
            
            uneRepresentation = new Representation(id, dateRep, lieu, groupe, heureDebut, heureFin);
            lesRepresentations.add(uneRepresentation);
        }
        return lesRepresentations;
    }

    public static Representation selectOne(int idRep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**public static int update(String idRepresentation, Representation unRepresentation) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "UPDATE REPRESENTATION SET ID = ? , DATE_REP = ?,ID_LIEU = ? , ID_GROUPE = ? , HEUREDEBUT = ? , HEUREFIN = ? ";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, idRepresentation);
        pstmt.setDate(2, unRepresentation.getDateRep());
        pstmt.setString(3, unRepresentation.getLeLieu());
        pstmt.setString(4, unRepresentation.getLeGroupe());
        pstmt.setString(5, unRepresentation.getHeureDebut());
        pstmt.setString(6, unRepresentation.getHeureFin());
        nb = pstmt.executeUpdate();
        return nb;
   
    } */
}

