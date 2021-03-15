/*
Author: Khoa Bui
Project: HomeWork 4
Description: This class declare the class Student implement Cloneable interface to deep copy
 */

class Student implements Cloneable {
    private String FirstName;
    private String LastName;
    private int Age;
    private float Gpa;
    private String Major;
    private String Department;
    private Course Course;

    public Student(String firstName,String lastName,int age,float gpa,String major,String department)
    {
        FirstName=firstName;
        LastName=lastName;
        Age=age;
        Gpa=gpa;
        Major=major;
        Department=department;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return Age;
    }

    public float getGpa() {
        return Gpa;
    }

    public String getMajor() {
        return Major;
    }

    public String getDepartment() {
        return Department;
    }
    public Course getCourse() {
        return Course;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGpa(float gpa) {
        Gpa = gpa;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    public void setCourse(Course course)
    {
        Course=course;
    }
    // This method create the deep copy of the object
    @Override
    protected Object clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
            student.Course = (Course) student.Course;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return student;
    }
    public void printInfo() {
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name :" + LastName);
        System.out.println("Age : " + Age);
        System.out.println("GPA :" + Gpa);
        System.out.println("Major :" + Major);
        System.out.println("Department :" + Department);

        System.out.print("Course Details:" + Course.getCourseName());
        System.out.print(", " + Course.getCourseDescription());
        System.out.print(", " + Course.getDepartment());
        System.out.print("," + Course.getStartTime());
        System.out.println("," + Course.getWeekday());
    }

}