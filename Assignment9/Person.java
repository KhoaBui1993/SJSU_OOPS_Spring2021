/*
Homework 9
Version: 0.1
Author: Khoa Bui
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int Age;
    private String SSN;
    private Address Address;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String ssn, Address address) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        SSN = ssn;
        Address = address;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String ssn) {
        SSN = ssn;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "FirstName: " + FirstName +"\nLastName: " + LastName + "\nAge: " + Age + "\nAddress: " + Address ;
    }
}