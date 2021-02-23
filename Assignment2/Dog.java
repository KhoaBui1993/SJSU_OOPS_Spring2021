/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 5, Dog class. this file create to inherited from animal class and override some method from the interface.
*/
public class Dog extends Animal implements Domesticated{
    public Dog(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }
    //override the walk method from interface Domesticated
    @Override
    public void walk() {
        System.out.println("Walking!");
    }
    //override the greatHuman method from interface Domesticated
    @Override
    public void greetHuman() {
        System.out.println("Wave tail!");
    }

}
