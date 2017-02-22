package com.company.Classes;

/**
 * Created by nxtlvl on 2/17/2017.
 */
public class Employee extends Person {

    String department;
    int paygrade;
    int employeID;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }

    public int getPaygrade() {
        return paygrade;
    }

    public void setPaygrade(int paygrade) {
        paygrade = paygrade;
    }

    public int getEmployeID() {
        return employeID;
    }

    public void setEmployeID(int employeID) {
        employeID = employeID;
    }

    public String introduceYourself(String firstname, String lastname) {
        return "Hi im a employee : " + firstname + " " + lastname;
    }
    public String overLoading(String firstname, String lastname, int age, String email, String address){
        return "Exercies : " + firstname + " " + lastname + " " + age + " " + email + " " + address;
    }
}