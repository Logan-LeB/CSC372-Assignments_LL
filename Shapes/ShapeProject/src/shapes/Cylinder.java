package shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
    @Override
    public String toString() {
        return String.format("Cylinder - Surface Area: %.2f, Volume: %.2f", 
                           surface_area(), volume());
    }
}