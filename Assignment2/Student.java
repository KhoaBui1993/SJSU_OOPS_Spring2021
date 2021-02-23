/*
Author: Khoa Bui
Version: 0.1
Program: Create the student class and print all the information include schedule of the student
 */
public class Student {
    private String FirstName;
    private String LastName;
    private int Age;
    private float Gpa;
    private String Major;
    private String Department;
    //Contructor student class
    public Student(String firstName, String lastName, int age, float gpa, String major, String department)
    {
        FirstName=firstName;
        LastName=lastName;
        Age=age;
        Gpa=gpa;
        Major=major;
        Department=department;
    }
    //non-static inner class
    class Course
    {
        public void printSchedule()
        {
            System.out.println("Schedule: \nCS151 Tue/Thur 6-7:15 \nEng101 Mon/Wed 10-11:45 \nHist10 Tue/Thur 1:30-2:45");
        }
    }
    // The method to print all the information and printSchedule from the inner class
    void Print_Information() {
        Course schedule = new Course();
        System.out.println(FirstName);
        System.out.println(LastName);
        System.out.println(Age);
        System.out.println(Gpa);
        System.out.println(Major);
        System.out.println(Department);
        schedule.printSchedule();
    }
    public String getFirstName()
    {
        return FirstName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public int getAge()
    {
        return Age;
    }
    public Float getGpa()
    {
        return Gpa;
    }
    public String getMajor()
    {
        return Major;
    }
    public String getDepartment()
    {
        return Department;
    }
    public void setFirstName(String firstName)
    {
        FirstName= firstName;
    }
    public void setLastName(String lastName)
    {
        LastName=lastName;
    }
    public void setAge(int age)
    {
        Age=age;
    }
    public void setGpa(float gpa)
    {
        Gpa=gpa;
    }
    public void setMajor(String major)
    {
        Major=major;
    }
    public void setDepartment(String department)
    {
        Department=department;
    }

}
