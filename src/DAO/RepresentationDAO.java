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
            int nbPlace = rs.getInt("NBPLACE");
            
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
            int nbPlace = rs.getInt("NBPLACE");
            
            uneRepresentation = new Representation(id, dateRep, lieu, groupe, heureDebut, heureFin, nbPlace);
            lesRepresentations.add(uneRepresentation);
        }
        return lesRepresentations;
    }

    public static Representation selectOne(int idRep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public static void nbPlace(int placeVendu, String id) throws SQLException {
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "UPDATE Representation SET nbplace = nbplace -"+ placeVendu +" where id='" + id + "'";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.executeUpdate();
    }
}

