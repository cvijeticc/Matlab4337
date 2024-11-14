/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Zvanje;
/**
 *
 * @author andri
 */
public class DBBroker {

    public boolean sacuvajProfesoraUBazi(String imeZaCuvanje, String prezimeZaCuvanje, Zvanje ZvanjeZaCvuvanje, String EmailOdKorisnika) throws SQLException {
        String query = "INSERT INTO profesor (ime, prezime, zvanje, emailKorisnika) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(query);
            ps.setString(1, imeZaCuvanje);
            ps.setString(2, prezimeZaCuvanje);
            ps.setString(3, String.valueOf(ZvanjeZaCvuvanje) );
            ps.setString(4, EmailOdKorisnika);
            int affectedRows = ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
//            if (affectedRows>0) {
//                return true;
//            }else{return false;}
            
            return affectedRows>0;
        } catch (SQLException ex) {
            Konekcija.getInstance().getConnection().rollback();
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
       
    }
    
}
