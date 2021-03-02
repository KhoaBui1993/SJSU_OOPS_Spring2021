/*
Homework 3:
Exercise 1
Version 1.0
Author: Khoa Bui.
Description: Customer class store information about customer and print it with method introduce and makePayment.
 */
public class Customer extends Person {

    private int CustomerID;
    private String PaymentPreference;

    public Customer() {
        super();
    }

    public Customer(String firstName, String lastName, int age, String ssn, Address address, int customerID) {
        super(firstName, lastName, age, ssn, address);
        CustomerID = customerID;
    }

    public int getCustomerID() {
        return CustomerID;
    }
    public String getPaymentPreference() {
        return PaymentPreference;
    }
    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
    public void setPaymentPreference(String paymentPreference) {
        PaymentPreference = paymentPreference;
    }
    // method to print the information of customer
    public void introduce(){
        System.out.println(super.toString()+"\ncustomerID: " + CustomerID +
                "\npaymentPreference: " + PaymentPreference);
    }
    // method to print out what payment preference of customer.
    public void makePayment(){
        System.out.println(PaymentPreference);
    }
}