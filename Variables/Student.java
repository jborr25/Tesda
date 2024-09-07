package Variables;
//Static variable
//declared with the static keyword inside a class but outside any method.
public class Student {
    int rollNo;
    String name;
    static String college = "ABC College"; // static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        Student s2 = new Student(102, "Doe");

        System.out.println(s1.name + " studies at " + Student.college);
        System.out.println(s2.name + " studies at " + Student.college);
    }
}