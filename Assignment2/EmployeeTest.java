/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 3, EmployeeTest class. this file create to test the employee class and Person class
*/

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1= new Employee("Joe","Smith",20,12345,"123 sessions drive","Male", 136f,0001,"Contractor", 60.0);
        employee1.introduce();
        System.out.println("Salary: "+employee1.calculatePay(30.0));

        System.out.println();
        Employee employee2= new Employee("Lisa","Gray",23,12346,"1234 sessions drive","Female",223f,0002,"Full time", 110000.0);
        employee2.introduce();
        System.out.println("Salary: "+employee2.calculatePay(2.0)+"\n");


        Employee employee3= new Employee("Timothy","Briggs",34,12347,"1235 sessions drive","Male",132f,0003,"Full time",80000);
        employee3.introduce();
        System.out.println("Salary: "+employee3.calculatePay(4.0)+"\n");


        Employee employee4= new Employee("George","Wallace",42,12348,"1236 sessions drive","Male",145f,0004,"Part-time",20);
        employee4.introduce();
        System.out.println("Salary: "+employee4.calculatePay(25.0)+"\n");


        Employee employee5= new Employee("Amy","Student",30,12349,"1237 sessions drive","Female",123f,0005,"Contractor",45);
        employee5.introduce();
        System.out.println("Salary: "+employee5.calculatePay(45.0)+"\n");
    }
}
