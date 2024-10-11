package interfaceexample;

public class SampleClass implements SampleInterface, SampleInterface2{
    @Override
    public void demo1() {
        System.out.println("abc is "+SampleInterface.abc);
        System.out.println("demo1 implemetation inside SampleClasss");
    }

    @Override
    public void demo2() {
        System.out.println("xyz is "+SampleInterface.xyz);
        System.out.println("demo2 implemetation inside SampleClasss");
    }

    @Override
    public void sample() {
        System.out.println("pqr is "+SampleInterface2.pqr);
        System.out.println("sample implemetation inside SampleClasss");
    }
}
