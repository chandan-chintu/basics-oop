package abstarctionexample;

public class MainClass {
    public static void main(String[] args) {
       // AbstarctClass abstarctClass = new AbstarctClass(); cannot create object for abstract class

        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.demo1();
        concreteClass.demo2();
    }
}
