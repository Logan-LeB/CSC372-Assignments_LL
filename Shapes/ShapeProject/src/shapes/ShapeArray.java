package shapes;

public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate shapes
        Shape sphere = new Sphere(5.0);
        Shape cylinder = new Cylinder(3.0, 7.0);
        Shape cone = new Cone(4.0, 6.0);
        
        // Store in array
        Shape[] shapeArray = {sphere, cylinder, cone};
        
        // Loop through and print
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
