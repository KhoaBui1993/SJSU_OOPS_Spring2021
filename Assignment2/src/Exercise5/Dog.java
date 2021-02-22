package Exercise5;

public class Dog extends Animal implements Domesticated{
    public Dog(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void walk() {
        System.out.println("Walking!");
    }

    @Override
    public void greetHuman() {
        System.out.println("Wave tail!");
    }

}
