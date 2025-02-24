package inheritanceexample;

public class Fish extends Animal{

    public void swim(){
        System.out.println("Fish can swim");
    }

    @Override
    public void see() {
        System.out.println("Fish can see");
    }
    @Override
    public void smell() {
        System.out.println("Fish can smell");
    }

    @Override
    public void breathe() {
        System.out.println("Fish can breathe");
    }
}
