/*
Author: Khoa Bui
Project: HomeWork 4
Description: This class create to test the employee class with compute method
 */
public class EmployeeTest {
    public static void main(String[] args) throws Employee.TooManyHoursWorkedException {
        Employee employee1 = new Employee("John","Smith",001,35);
        System.out.println(employee1.computePay(40));
        System.out.println(employee1.computePay(23));
        System.out.println(employee1.computePay(1));
        System.out.println(employee1.computePay(0));
        System.out.println(employee1.computePay(-5));
        System.out.println(employee1.computePay(45));
    }
}
