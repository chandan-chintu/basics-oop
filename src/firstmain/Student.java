package firstmain;

public class Student {

    int studentId;
    String name;
    String dob;
    String gender;
    String email;
    String grade;

    public void simpleMethod(){
        System.out.println("sample method");
    }

    public static void simpleMethod2(){
        System.out.println("sample method2");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Student(int studentId, String name, String dob, String gender, String email, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.grade = grade;
    }

    public Student() {
    }
}
