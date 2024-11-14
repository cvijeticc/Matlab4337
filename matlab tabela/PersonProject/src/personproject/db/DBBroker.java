/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import personproject.domain.Person;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDate;
import personproject.domain.City;
import personproject.domain.Gender;

/**
 *
 * @author student2
 */
public class DBBroker {

    public DBBroker() {
    }

    public List<Person> loadPersons() {
        List<Person> persons = new ArrayList<>();

        String query = "SELECT p.id, p.firstname, p.lastname, p.birthday, c.zip_code, c.name, p.gender, p.married "
                + "FROM person p JOIN city c ON p.zip_code = c.zip_code";
        System.out.println(query);
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getLong("p.id"));
                person.setFirstName(rs.getString("p.firstname"));
                person.setLastName(rs.getString("p.lastname"));
                person.setBirthday(LocalDate.parse(rs.getString("p.birthday")));
                person.setCity(new City(rs.getLong("c.zip_code"), rs.getString("c.name")));
                person.setGender(Gender.valueOf(rs.getString("p.gender")));
                person.setMarried(rs.getBoolean("p.married"));

                persons.add(person);
            }
        } catch (SQLException ex) {
            System.out.println("Connection error: " + ex);
        }

        return persons;
    }

    public List<City> getAllCities() throws Exception{
        List<City> cities = new ArrayList<>();

        
        String query = "SELECT * FROM city";
        System.out.println(query);
        Connection connection = DBConnection.getInstance().getConnection();

        try {
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
               City city=new City(rs.getLong("zip_code"),rs.getString("name"));
               cities.add(city);
            }
        } catch (SQLException ex) {
            System.out.println("Connection error: " + ex);
            throw new Exception(ex.getMessage());
        }
        return cities;
        
    }

}
