/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 5, AnimalTest class. this file create to run all the method from the other class.
*/
public class Animal {
    private String Type;
    private String Name;
    private int Age;
    private String Gender;
    private String Environment;
    private int Speed;

    public Animal(String type, String name, int age, String gender, String environment, int speed) {
        Type = type;
        Name = name;
        Age = age;
        Gender = gender;
        Environment = environment;
        Speed = speed;
    }

    public String getType() {
        return Type;
    }
    public String getName(){
        return Name;}
    public int getAge(){
        return Age;}
    public String getGender(){
        return Gender;}
    public String getEnvironment(){
        return Environment;}

    public void setType(String type){
        Type=type;
    }
    public void setName(String name){
        Name=name;
    }
    public void setGender(String gender){
        Gender=gender;
    }
    public void setAge(int age){
        Age=age;
    }
    public void setEnvironment(String environment){
        Environment=environment;
    }
    public void setSpeed(int speed){
        Speed=speed;
    }
    // method move make for the inherited class use it
    public void Move()
    {
        System.out.println("Move");
    }
    public void Sound()
    {
        System.out.println("Sound");
    }
    public void Eat()
    {
        System.out.println("Eat");
    }
    public void Sleep()
    {
        System.out.println("zzzzz!");
    }
    @Override
    //override toString method to print out all the attribute
    public String toString() {
        return "type=" + Type +
                ", name=" + Name +
                ", age=" + Age +
                ", gender=" + Gender +
                ", environment=" + Environment  +
                ", speed=" + Speed;
    }
}