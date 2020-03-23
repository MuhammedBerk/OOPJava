package Lab3.Q2;

public class TestCar {

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println("Model: " + c1.model);
        System.out.println("Color: " + c1.color);
        System.out.println("Speed: " + c1.speed);

        System.out.println();


        Car c2 = new Car("Sedan", "Red", (int) Math.random()*61+20);

        System.out.println("Model: " + c2.model);
        System.out.println("Color: " + c2.color);
        System.out.println("Speed: " + c2.speed);

        System.out.println();

        c2.decreaseSpeed(15);

        System.out.println("Model: " + c2.model);
        System.out.println("Color: " + c2.color);
        System.out.println("Speed: " + c2.speed);

    }
}
