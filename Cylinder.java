package Lab4;

public class Cylinder {

    private double r = 1;
    private double h = 1;
    private static int noOfCylinder = 0;

    public Cylinder(){
        noOfCylinder++;
    }

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
        noOfCylinder++;
    }

    public double getR(){
        return r;
    }

    public double getH(){
        return h;
    }

    public void setR(double newR){
        if(newR >= 0)   r = newR;
        else r = 0;
    }

    public void setH(double newH){
        if(newH >= 0)   h = newH;
        else    h = 0;
    }

    public static int getNumberOfCylinder(){
        return noOfCylinder;
    }

    public double calculateBaseArea(){
        return Math.PI * r * r;
    }

    public double calculateSurfaceArea(){
        return 2 * Math.PI * r * (r+h);
    }

    public double calculateVolume(){
        return Math.PI * r * r * h;
    }

    public double calculateMass(double density){
        return calculateVolume() * density;
    }
}
