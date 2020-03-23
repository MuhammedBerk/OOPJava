package Lab3;

public class Rectangle {
    int width = 1;
    int height = 1;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        width = a;
        height = b;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public int calculateArea() {
        return width * height;
    }

    public int[] setDimensions() {
        int[] dimensions = new int[2];
        width = (int)(Math.random() * 100 + 1);
        height = (int)(Math.random() * 100 + 1);
        dimensions[0] = width;
        dimensions[1] = height;
        return dimensions;
    }

}
