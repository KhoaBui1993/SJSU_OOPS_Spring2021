package Exercise5;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog=new Dog("Dog","Lulu",5,"Male","Home",10);
        System.out.println(dog);
        dog.Move();
        dog.Eat();
        dog.walk();
        dog.greetHuman();

        Cat cat=new Cat("Cat","Tom",6,"Male","Home",8);
        System.out.println(cat);
        cat.scratch();
        cat.greetHuman();
        cat.Sleep();
        cat.Sound();

        Racoon racoon=new Racoon("Racoon","RAO",10,"Female","Forest",9);
        System.out.println(racoon);
        racoon.scratch();
        racoon.Eat();
        racoon.Move();

        Whale whale=new Whale("Whale","whale",7,"Female","ocean",20);
        System.out.println(whale);
        whale.swim();
        whale.Eat();

    }
}
