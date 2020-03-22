package Lab2.Q2;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Age: " + student1.age);
        System.out.println("Name: " + student1.name);

        System.out.println();

        student1.name = "Ayse";
        student1.age = 15;
        student1.isJunior = true;
        student1.gender = 'f';

        System.out.println("Age: " + student1.age);
        System.out.println("Name: " + student1.name);

        System.out.println();

        student1.info();
    }
}
