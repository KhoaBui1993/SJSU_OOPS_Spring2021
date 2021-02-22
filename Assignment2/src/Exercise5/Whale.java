package Exercise5;

public class Whale extends Animal implements Swimmer{
    public Whale(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void swim() {
        System.out.println("Swimming!");
    }
}
