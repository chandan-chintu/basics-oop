package inheritanceexample;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("----------------------------Animal parent class-------------------------------");
        Animal animal = new Animal();
        animal.see();
        animal.breathe();
        animal.smell();



        System.out.println("----------------------------Human child class-------------------------------");
        Human human = new Human();
        human.talk();
        human.smell();
        human.see();
        human.breathe();

        Animal human1 = new Human();
        human1.smell();
        human1.see();
        human1.breathe();
       // human1.talk(); it will give compile time error

        System.out.println("----------------------------Dog child class-------------------------------");
        Dog dog = new Dog();
        dog.bark();
        dog.smell();
        dog.see();
        dog.breathe();

        System.out.println("----------------------------Bird child class-------------------------------");
        Bird bird = new Bird();
        bird.fly();
        bird.smell();
        bird.see();
        bird.breathe();

        System.out.println("----------------------------Fish child class-------------------------------");
        Fish fish = new Fish();
        fish.swim();
        fish.smell();
        fish.see();
        fish.breathe();

    }
}
