package Variables;
//Instance Variables (Non-Static Fields)
public class Child {
    String Child;
    String bdate;
    int age;
public static void main(String[] args) {
    Child C1 = new Child();
    Child C2 = new Child();

    C1.Child = "Jarred";
    C1.bdate = "July 27 2015";
    C1.age = 9;

    C2.Child = "Fiel";
    C2.bdate = "December 27 2023";
    C2.age = 8;

System.out.println(C1.Child + " was born on " + C1.bdate + " and is now " + C1.age + " years old.");
System.out.println(C2.Child + " was born on " + C2.bdate + " and is now " + C2.age + " months old.");
}
}
