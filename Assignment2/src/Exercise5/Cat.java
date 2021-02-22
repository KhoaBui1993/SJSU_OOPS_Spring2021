package Exercise5;

public class Cat extends Animal implements Domesticated,Scratcher{
    public Cat(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void walk() {

    }

    @Override
    public void greetHuman() {

    }

    @Override
    public void scratch() {

    }
}
