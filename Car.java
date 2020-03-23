package Lab3.Q2;

public class Car {

    String model;
    String color;
    int speed;

    public Car (){
        model = "-";
        color = "-";
        speed = 0;
    }

    public Car (String newModel, String newColor, int newSpeed){
        model = newModel;
        color = newColor;
        speed = newSpeed;
    }

    public void increaseSpeed (int newSpeed){
        speed += newSpeed;
    }

    public void decreaseSpeed (int newSpeed){
        speed -= newSpeed;
    }
}
