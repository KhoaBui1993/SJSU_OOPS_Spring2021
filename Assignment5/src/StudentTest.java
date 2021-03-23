/*
Author: Khoa Bui
Homework 5
Exercise 3
 */
import java.util.ArrayList;

public class StudentTest {
  public static void main(String[] args) {
      ArrayList<Person> myList= new ArrayList<>();
      Person person1= new Person("Joe","Smith",40);
      Person person2= new Person("Amy","Gold",32);
      Person person3= new Person("Tony","Stork",21);
      Person person4= new Person("Sean","Irish",24);
      Person person5= new Person("Tina","Brock",28);
      Person person6= new Person("Lenny","Hep",18);
      myList.add(person1);
      myList.add(person2);
      myList.add(person3);
      myList.add(person4);
      myList.add(person5);
      myList.add(person6);
      System.out.println("Sorted list Person with Age ascending");
      myList.sort((Person p1, Person p2) -> p1.getAge() - p2.getAge());
      ArrayList<Person> Sort_Age_acs= new ArrayList<>(myList);
      Sort_Age_acs.forEach((s)->System.out.println(s));

      System.out.println("Sorted list Person with Age descending");
      myList.sort((Person p1, Person p2)->p2.getAge()-p1.getAge());
      ArrayList<Person> Sort_Age_decs= new ArrayList<>(myList);
      Sort_Age_decs.forEach((s)->System.out.println(s));

      System.out.println("Sorted list Person with Firstname ascending");
      myList.sort((Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
      ArrayList<Person> Sort_FName_acs= new ArrayList<>(myList);
      Sort_FName_acs.forEach((s)->System.out.println(s));

      System.out.println("Sorted list Person with Firstname descending");
      myList.sort((Person p1, Person p2)->p2.getFirstName().compareTo(p1.getFirstName()));
      ArrayList<Person> Sort_FName_decs= new ArrayList<>(myList);
      Sort_FName_decs.forEach((s)->System.out.println(s));

      System.out.println("Sorted list Person with length of Lastname ascending");
      myList.sort((Person p1, Person p2)->p1.getLastName().length()-p2.getLastName().length());
      ArrayList<Person> Sort_LName_acs= new ArrayList<>(myList);
      Sort_LName_acs.forEach((s)->System.out.println(s));

      System.out.println("Sorted list Person with length of Lastname descending");
      myList.sort((Person p1, Person p2)->p2.getLastName().length()-p1.getLastName().length());
      ArrayList<Person> Sort_LName_decs= new ArrayList<>(myList);
      Sort_LName_decs.forEach((s)->System.out.println(s));

  }
}
