package inheritanceexample;

public class Bird extends Animal{

    public void fly(){
        System.out.println("Bird can fly");
    }

    @Override
    public void see() {
        System.out.println("Bird can see");
    }
    @Override
    public void smell() {
        System.out.println("Bird can smell");
    }

    @Override
    public void breathe() {
        System.out.println("Bird can breathe");
    }
}
