package ru.dautov.springcourse.models;

import javax.validation.constraints.NotEmpty;

public class Book {
    private int id;
    @NotEmpty(message = "Название книги не может быть пустым")
    private String name;
    @NotEmpty(message = "Введите имя автора")
    private String author;

    private int year;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book() {
    }

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
