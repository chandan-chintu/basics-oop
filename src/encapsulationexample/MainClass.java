package encapsulationexample;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(123);
        s1.setName("Bindhu");
        s1.setGender("female");
        s1.setGrade("9th A");
        s1.setDob("12/03/2007");
        s1.setEmail("bindhu123@gmail.com");

        System.out.println("s1 is after setting values : "+s1);

        System.out.println("name of s1 is : "+s1.getName());
        System.out.println("email of s1 is : "+s1.getEmail());
    }
}
