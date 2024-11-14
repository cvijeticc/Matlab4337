/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author andri
 */
public class Profesor {
    private int id;
    private String ime;
    private String prezime;
    private Zvanje zvanje;
    private String emailKorisnika;

    public Profesor() {
    }

    public Profesor(String ime, String prezime, Zvanje zvanje, String emailKorisnika) {
        this.ime = ime;
        this.prezime = prezime;
        this.zvanje = zvanje;
        this.emailKorisnika = emailKorisnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Zvanje getZvanje() {
        return zvanje;
    }

    public void setZvanje(Zvanje zvanje) {
        this.zvanje = zvanje;
    }

    public String getEmailKorisnika() {
        return emailKorisnika;
    }

    public void setEmailKorisnika(String emailKorisnika) {
        this.emailKorisnika = emailKorisnika;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    @Override
    public String toString() {
        return "Profesor{" + "ime=" + ime + ", prezime=" + prezime + ", zvanje=" + zvanje + ", emailKorisnika=" + emailKorisnika + '}';
    }
    
    
}
