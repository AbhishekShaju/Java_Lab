public class Shape {
    public final static double PI = 3.14159;
    
    public Shape() {
        System.out.println("Shape Calculator Initialized");
    }
    
    // Calculate area of square
    public double calculateArea(double side) {
        return side * side;
    }
    
    // Calculate area of rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    
    // Calculate area of circle
    public double calculateAreaCircle(double radius) {
        return PI * radius * radius;
    }
}
