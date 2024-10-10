package polymorphismexample;

public class MainClass {
    public static void main(String[] args) {
        SampleClass s1 = new SampleClass();

        s1.sum(1,2);
        s1.sum(2,5,8);
        s1.sum(3.45,44.4);
        s1.sum(2.34f,3.45f);

    }
}
