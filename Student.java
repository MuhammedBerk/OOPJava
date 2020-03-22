package Lab2.Q2;

public class Student {

        String name;
        int age;
        boolean isJunior;
        char gender;

        public Student(){
            name = "";
            age = 0;
            isJunior = false;
            gender = 'm';
        }

        public void info(){
            System.out.println("Student: " + name + "\nAge: " + age + "\nGender: " + gender + "\nJunior: " + isJunior + "\n");
        }
    }

