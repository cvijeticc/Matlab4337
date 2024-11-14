/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject.domain;

import java.time.LocalDate;

/**
 *
 * @author student2
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastname;
    private LocalDate birthday;
    private City city;
    private Gender gender;
    private boolean married;

    public Person() {
    }

    public Person(Long id, String firstName, String lastName, LocalDate birthday, City city, Gender gender, boolean married) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastName;
        this.birthday = birthday;
        this.city = city;
        this.gender = gender;
        this.married = married;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
    
    
}
