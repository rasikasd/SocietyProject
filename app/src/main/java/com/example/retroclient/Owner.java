package com.example.retroclient;

import static java.sql.Types.NULL;

public class Owner {

    private String firstname;
    private String lastname;
    private String flatno;

    public Owner( String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Owner() {

    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFlatno() {
        return flatno;
    }
    public void setFlatno(String flatno) {
        this.flatno = flatno;
    }
}
