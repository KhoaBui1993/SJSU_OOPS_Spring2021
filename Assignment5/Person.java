/*
Author: Khoa Bui
Homework 5
Exercise 2
 */
public  class Person {
    private String FirstName;
    private String LastName;
    private int Age;

    public Person(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    @Override
    public String toString()
    {
        return FirstName+" "+LastName+", "+Age;
    }
}
