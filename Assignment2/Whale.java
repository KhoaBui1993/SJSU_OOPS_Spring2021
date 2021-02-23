/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 5,Whale class. this file create the Whale class and inherited from the animal class and implements swimmer
interface
*/
public class Whale extends Animal implements Swimmer{
    public Whale(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void swim() {
        System.out.println("Swimming!");
    }
}
