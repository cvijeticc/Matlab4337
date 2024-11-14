/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Korisnik;
import model.Zvanje;

/**
 *
 * @author andri
 */
public class Controller {
    
    private Korisnik izabraniKorisnik;
    //ins dbb dbb ins
    
    private List<Korisnik> listaKorisnika = new ArrayList<>();
    
    
    
    private static Controller instance;
    private DBBroker dbb;
    
    private Controller() {
        dbb = new DBBroker();
        
        Korisnik k1 = new Korisnik("Ana", "Anic", "ana@gmail.com", "ana");
        Korisnik k2 = new Korisnik("Mare", "Maric", "mare@gmail.com", "mare");
        
        listaKorisnika.add(k1); listaKorisnika.add(k2);
        
        
        
    }
    
    public static Controller getInstance(){
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public Korisnik daLiJeDObarLogIn(String mail, String lozinka) {
        for (Korisnik k : listaKorisnika) {
            if (k.getMail().equals(mail) &&  k.getLozinka().equals(lozinka)) {
                izabraniKorisnik = k;
                return k;
            }
        }
    return null;
    }

    public Korisnik getIzabraniKorisnik() {
        return izabraniKorisnik;
    }

    public void setIzabraniKorisnik(Korisnik izabraniKorisnik) {
        this.izabraniKorisnik = izabraniKorisnik;
    }

    public List<Korisnik> getListaKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(List<Korisnik> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }

    public boolean sacuvajProfesoraUBazi(String imeZaCuvanje, String prezimeZaCuvanje, Zvanje ZvanjeZaCvuvanje, String EmailOdKorisnika) throws SQLException {
        return dbb.sacuvajProfesoraUBazi(imeZaCuvanje,  prezimeZaCuvanje,  ZvanjeZaCvuvanje,  EmailOdKorisnika);
    }

   

   

    
    
}
