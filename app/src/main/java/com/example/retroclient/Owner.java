package com.example.retroclient;

import static java.sql.Types.NULL;

public class Owner {

    private String firstname;
    private String lastname;
    private String flatno;
    private int id;



    public Owner(int id , String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.id=id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", flatno='" + flatno + '\'' +
                ", id=" + id +
                '}';
    }
}
