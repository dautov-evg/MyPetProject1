package ru.dautov.springcourse.models;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


public class Person {
    private int id;

    @NotEmpty(message = "ФИО должно быть заполнено")
    private String fullName;
    @Min(value = 1900, message = "Год рождения должен быть позже 1900")
    private int yearOfBirth;



    public Person(int id, String fullName, int yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
