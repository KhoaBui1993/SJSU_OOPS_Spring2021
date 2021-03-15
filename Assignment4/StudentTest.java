/*
Author: Khoa Bui
Project: HomeWork 4
Description: This class declare the class Course implement Cloneable interface to deep copy
 */
public class StudentTest {
    public static void main(String[] args) {
        Course course = new Course("CS151", "Object Oriented Design and Programming",
                "CS", "6:00pm", "Tue");
        Student student= new Student("Khoa","Bui",28, 3.35f,"Computer Science","CS");
        student.setCourse(course);
        student.printInfo();
        System.out.println("==============Cloned Student Detail=============");
        Student student1=(Student) student.clone();
        student1.printInfo();
    }
}