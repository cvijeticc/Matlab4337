/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject.table_models;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import personproject.controller.Controller;
import personproject.domain.Person;

/**
 *
 * @author student2
 */
public class PersonTableModel extends AbstractTableModel {

    List<Person> persons;
    String columns[] = {"Id", "Firstname", "Lastname", "Birthday", "City", "Gender", "Married"};

    public PersonTableModel() {
        this.persons = Controller.getInstance().loadPersons();
    }

    @Override
    public int getRowCount() {
        return persons.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = persons.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return person.getId();
            case 1:
                return person.getFirstName();
            case 2:
                return person.getLastname();
            case 3:
                return person.getBirthday();
            case 4:
                return person.getCity();
            case 5:
                return person.getGender();
            case 6:
                return person.isMarried();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public Person get(int selectedRow) {
        if (selectedRow < 0) {
            throw new ArrayIndexOutOfBoundsException(selectedRow);
        }
        return persons.get(selectedRow);
    }

}
