/*
Homework 3:
Exercise 1
Version 1.0
Author: Khoa Bui.
Description: Employee class store information about employee for other class with abstract class.
 */
public abstract  class Employee extends Person {

    private int Id;
    private String EducationalLevel;
    private boolean DirectDeposit;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, int age, String ssn, Address address, int id) {
        super(firstName, lastName, age, ssn, address);
        Id = id;
    }

    public int getId() {
        return Id;
    }
    public String getEducationalLevel() {
        return EducationalLevel;
    }
    public boolean isDirectDeposit() {
        return DirectDeposit;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setEducationalLevel(String educationalLevel) {
        EducationalLevel = educationalLevel;
    }
    public void setDirectDeposit(boolean directDeposit) {
        DirectDeposit = directDeposit;
    }
}
