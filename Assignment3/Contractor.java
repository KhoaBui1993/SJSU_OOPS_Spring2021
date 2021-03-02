/*
Homework 3:
Exercise 1
Version 1.0
Author: Khoa Bui.
Description: Contractor class store information about employee work with contractor type and calculate the payAmount for them.
 */
public class Contractor  extends Employee{
    private Double BasePay;

    public Contractor() {
        super();
    }

    public Contractor(String firstName, String lastName, int age, String ssn, Address address,  Double basePay,int id) {
        super(firstName, lastName, age, ssn, address, id);
        BasePay = basePay;
    }

    public Double getBasePay() {
        return BasePay;
    }

    public void setBasePay(Double basePay) {
        BasePay = basePay;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nbasePay: " + BasePay;
    }

    public void introduce(boolean displaySSN){
        if(displaySSN){
            System.out.println("SSN:"+this.getSSN());
        }
    }
    public Double computePay(int numHrs){
        return numHrs*BasePay;
    }
}