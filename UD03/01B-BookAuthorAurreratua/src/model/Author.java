/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazquez.asier
 */
public class Author {
    // The private instance variables

    private String name;
    private String email;
    private char gender;   // 'm' or 'f'

    /**
     * Constructs a Author instance with the given inputs
     */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // The public getters and setters for the private instance variables.
    // No setter for name and gender as they are not designed to be changed.
    /**
     * Returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Returns the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a self-descriptive String
     */
    public String toString() {
        String s = "";

        if (gender == 'm') {
            s = "Izena: " + name
                    + "\neMaila: " + email
                    + "\nGeneroa: Gizona";
        } else {
            s = "Izena: " + name
                    + "\neMaila: " + email
                    + "\nGeneroa: Emakumea";
        }

        return s;
    }
}
