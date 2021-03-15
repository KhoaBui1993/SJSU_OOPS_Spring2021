/*
Author: Khoa Bui
Project: HomeWork 4
Description: Employee class create the object employee and the method computePay to return the pay check for employee with hours input
 */
public class Employee{
    String FirstName;
    String LastName;
    int EmployeeId;
    int HourlyPay;

    public Employee(String firstName,String lastName,int  employeeId,int hourlyPay){
        FirstName = firstName;
        LastName = lastName;
        HourlyPay = hourlyPay;
        EmployeeId = employeeId;

    }
    public void setFirstName(String firstName){
        FirstName = firstName;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setLastName(String lastName){
        LastName = lastName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setEmployeeId(int employeeId){
        EmployeeId = employeeId;
    }
    public int getEmployeeId(){
        return EmployeeId;
    }
    public void setHourlyPay(int hourlyPay){
        HourlyPay = hourlyPay;
    }
    public int getHourlyPay(){
        return HourlyPay;
    }


    public float computePay(int hours) {
        if(hours < 0)
            try {
                throw new NumberFormatException("The number of hours is negative");
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
                // computePay must return the float type, so after we send the message we need print 0
                return 0;
            }
        if(hours > 40)
            try {
                throw new TooManyHoursWorkedException("Hours greater than 40");
            } catch (TooManyHoursWorkedException e) {
                // computePay must return the float type, so after we send the message we need print 0
                return 0;
            }
        else
        return hours*HourlyPay;
    }
    //create the Toomanyhoursworkedexception to handle the case hours worked greater than 40
    public class TooManyHoursWorkedException extends Throwable {
        public TooManyHoursWorkedException(String s) {
            System.out.println(s);
        }
    }
}
