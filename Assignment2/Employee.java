/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 3, Employee class. this file create the Employee class with all attribute.
*/
public class Employee extends Person{
    private int Id;
    private String Status;
    private Double Pay_amount;
    public Employee(String firstName, String lastName, int age, int socialSecurity, String address, String gender, Float weight,int id ,String status, double pay_amount ) {
        super(firstName, lastName, age, socialSecurity, address, gender, weight);
        Id = id;
        Status = status;
        Pay_amount = pay_amount;
    }
    public int getId() {
        return Id;
    }
    public String getStatus() {
        return Status;
    }
    public Double getPay_amount() {
        return Pay_amount;
    }
    public void setId(int id) {
        Id = id;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public void setPay_amount(Double pay_amount) {
        Pay_amount = pay_amount;
    }
    // override the method introduce to add the id,status and pay amount of employee to the output
    @Override
    public void introduce() {
        System.out.println(super.toString()+",id:" + Id + ", status:'" + Status +
                ", Pay Amount:" + Pay_amount );
    }
    //method calculate the pay check for the employee
    public double calculatePay(double unitsWorked)
    {
        if (Status=="full time")
            return (getPay_amount()/52)*unitsWorked;
        else
            return (getPay_amount()*unitsWorked);
    }
}
