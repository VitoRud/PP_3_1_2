package ru.vitorud.PP_3_1_2.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Введите имя")
    @Column(name = "name")
    @Pattern(regexp = "[а-яёА-ЯЁA-Za-z]+", message = "Имя может содержать только буквы")
    private String name;
    @NotEmpty(message = "Введите фамилию")
    @Column(name = "surname")
    @Pattern(regexp = "[а-яёА-ЯЁA-Za-z]+", message = "Фамилия может содержать только буквы")
    private String surname;
    @NotEmpty(message = "Введите почту")
    @Email(message = "Некорректная почта")
    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
