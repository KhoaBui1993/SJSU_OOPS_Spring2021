/*
Author: Khoa Bui
Version: 0.1
Description: Exercise 5,Cat class. this file create the cat class and inherited from the animal class and implements 2
interface which are Demosticated and scratcher
*/
public class Cat extends Animal implements Domesticated,Scratcher{
    public Cat(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }
    //override the walk method from interface Domesticated
    @Override
    public void walk() {
        System.out.println("Walking");
    }
    //override the greatHuman method from interface Domesticated
    @Override
    public void greetHuman() {
        System.out.println("Licking face!");
    }
    //override the scratch method from interface Scratcher
    @Override
    public void scratch() {
        System.out.println("Scratching....!");
    }
}
