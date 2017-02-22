package com.company.Classes;

/**
 * Created by nxtlvl on 2/17/2017.
 */
public class Customer extends Person {

    private String address;
    private int telephone;
    private String customerID;

    public Customer(){

    }
    public Customer(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String introduceYourself(String firstname, String lastname) {
        return "Im a customer: " + firstname + " " + lastname;
    }

    public String overLoading(String firstname, String lastname, int age, String email, String address) {
        return "Exercies : " + firstname + " " + lastname + " " + age + " " + email + " " + address;
    }
}