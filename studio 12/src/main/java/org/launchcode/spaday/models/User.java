package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
    @NotEmpty(message="Please enter a username.")
    @Size(max = 15, min = 5)
    private String username;
    @Email(message = "Please provide a valid email address.")
    private String email;
    @NotEmpty(message = "Please enter a password.")
    private String password;

    public User() { }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
