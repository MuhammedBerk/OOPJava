package Lab3;
import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        System.out.println(r1.width);
        System.out.println(r1.height);
        System.out.println(r1.calculatePerimeter());
        System.out.println(r1.calculateArea());

        System.out.println();

        int[] newDimensions = r1.setDimensions();

        for(int i = 0 ; i < newDimensions.length ; i++) System.out.println(newDimensions[i]);

        System.out.println();

        System.out.println(r1.width);
        System.out.println(r1.height);
        System.out.println(r1.calculatePerimeter());
        System.out.println(r1.calculateArea());

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Width: ");
        int w = sc.nextInt();
        System.out.println("Height: ");
        int h = sc.nextInt();

        Rectangle r2 = new Rectangle(w,h);

        System.out.println(r2.width);
        System.out.println(r2.height);
        System.out.println(r2.calculatePerimeter());
        System.out.println(r2.calculateArea());
    }
}
