package com.tharon.todo.Models;
import javax.persistence.*;

@Entity
public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String favorite_instrument;

    public void setFavorite_instrument(String favorite_instrument) {
        this.favorite_instrument = favorite_instrument;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFavorite_instrument() {
        return favorite_instrument;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getId() {
        return id;
    }
}

