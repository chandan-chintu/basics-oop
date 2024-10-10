package firstmain;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello everyone welcome to spring1");

        Student s1 = new Student(); // creating the object
        System.out.println("s1 is : "+s1); // prints the memory location before adding tostring

        s1.studentId = 123;
        s1.name = "Sanjay";
        s1.gender = "male";
        s1.dob = "10/12/2007";
        s1.grade = "8th A section";
        s1.email = "sanjay123@gmail.com";

        System.out.println("s1 after assigning values : "+s1);

        Student s2 = new Student(234,"Vijay","19/10/2009","male","vijay123@gmail.com","8th B");
        System.out.println("s2 after initlaizing from parameterized constructor : "+s2);


        final int abc =1000;
        int xyz=1000;
        System.out.println("abc is "+abc);
        System.out.println("xyz is "+xyz);
        xyz =2000;
        System.out.println("xyz after changing is "+xyz);
       // abc =2000; - we cannot change final value


        Student s3 = new Student();
        s3.simpleMethod();
        Student.simpleMethod2();
    }
}
