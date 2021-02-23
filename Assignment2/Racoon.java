/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 5, Racoon class. this file create to inherited from animal class and override some method from the interface.
*/
public class Racoon extends Animal implements Scratcher{
    public Racoon(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }
    //override the scratch method from interface Scratcher
    @Override
    public void scratch() {
        System.out.println("Scratching....!");
    }
}
