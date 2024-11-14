/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import personproject.db.DBBroker;
import personproject.domain.City;
import personproject.domain.Person;

/**
 *
 * @author student2
 */
public class Controller {

    private static Controller instance;
    private DBBroker dbb;

    private Controller() {
        dbb = new DBBroker();
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    public List<Person> loadPersons() {
        return dbb.loadPersons();
    }

    public List<City> loadCities() throws Exception {
        try {
            return dbb.getAllCities();
        } catch (Exception ex) {
            //PAZI
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            //return null;
            throw ex;
        }
    }
}
