/*
Author: Khoa Bui
Homework 5
Exercise 2
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    private String FirstName;
    private String LastName;
    private int Age;
    private float Gpa;
    private String Major;
    private String Department;
    private LinkedList<Course> Course;

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
    public LinkedList<Course> getCourse() {
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
    public void setCourse(LinkedList<Course> course)
    {
        this.Course=course;
    }
    public void addCourse(Course course) {
        this.Course.add(course);
    }
    public void removeCourse(Course course) {
        this.Course.remove(course);
    }

    /**
     * @param attribute should be the string: name, description,department,starttime,weekday
     * @param ascending true or false
     */
    public void sortCourses(String attribute,Boolean ascending) {
        Comparator<Course> comp = null;
        //switch cases will prepare comparator according to type and attribute name
        switch(attribute.toLowerCase()) {
            case "name":
                comp = new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if(ascending)
                            return o1.getCourseName().compareTo(o2.getCourseName());
                        return o2.getCourseName().compareTo(o1.getCourseName());
                    }
                };
                break;
            case "description":
                comp = new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if(ascending)
                            return o1.getCourseDescription().compareTo(o2.getCourseDescription());
                        return o2.getCourseDescription().compareTo(o1.getCourseDescription());
                    }
                };
                break;
            case "department":
                comp = new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if(ascending)
                            return o1.getDepartment().compareTo(o2.getDepartment());
                        return o2.getDepartment().compareTo(o1.getDepartment());
                    }
                };
                break;
            case "starttime":
                comp = new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if(ascending)
                            return o1.getStartTime().compareTo(o2.getStartTime());
                        return o2.getStartTime().compareTo(o1.getStartTime());
                    }
                };
                break;
            case "weekday":
                comp = new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        if(ascending)
                            return o1.getWeekday().compareTo(o2.getWeekday());
                        return o2.getWeekday().compareTo(o1.getWeekday());
                    }
                };
                break;
            default:
                break;

        }
        Collections.sort(Course,comp); //sort according to prepared comparator
        for(Course c : Course) {//print all the records
            System.out.println(c.getCourseName()+" "+c.getCourseDescription()+" "+c.getDepartment()+" "+c.getStartTime()+" "+c.getWeekday());
        }
    }
}

