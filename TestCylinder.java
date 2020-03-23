package Lab4;

public class TestCylinder {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();

        System.out.println("Radius: " + c1.getR());
        System.out.println("Height: " + c1.getH());

        System.out.println();

        c1.setR(2.5);
        c1.setH(1.5);

        System.out.println("Radius: " + c1.getR());
        System.out.println("Height: " + c1.getH());

        System.out.println();

        System.out.println("Volume: " + c1.calculateVolume());

        System.out.println();

        Cylinder c2 = new Cylinder(2,5);

        System.out.println("Radius: " + c2.getR());
        System.out.println("Height: " + c2.getH());

        System.out.println();

        System.out.println("Base Area: " + c2.calculateBaseArea());
        System.out.println("Surface Area: " + c2.calculateSurfaceArea());
        System.out.println("Volume: " + c2.calculateVolume());

        System.out.println();

        System.out.println("Mass: " + c2.calculateMass(1.34));

        System.out.println();

        System.out.println("Cylinder Objects: " + c2.getNumberOfCylinder());
    }
}
