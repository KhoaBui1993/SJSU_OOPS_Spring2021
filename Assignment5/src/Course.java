/*
Author: Khoa Bui
Homework 5
Exercise 2
 */
public class Course {
    private String CourseName;
    private String CourseDescription;
    private String Department;
    private String StartTime;
    private String Weekday;


    public Course(String courseName, String courseDescription, String department, String courseStartTime, String weekday) {
        CourseName = courseName;
        CourseDescription = courseDescription;
        Department = department;
        StartTime = courseStartTime;
        Weekday = weekday;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public String getDepartment() {
        return Department;
    }

    public String getStartTime() {
        return StartTime;
    }

    public String getWeekday() {
        return Weekday;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setStartTime(String courseStartTime) {
        StartTime = courseStartTime;
    }

    public void setWeekday(String weekday) {
        Weekday = weekday;
    }
}
