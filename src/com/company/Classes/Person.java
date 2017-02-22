package com.company.Classes;

/**
 * Created by nxtlvl on 2/17/2017.
 */
public class Person {

    String firstname ;
    String lastname ;
    String email ;
    String password ;
    String username ;
    int age ;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String introduceYourself(String firstname, String lastname) {
        return "Im : " + firstname + " " + lastname;
    }
}
