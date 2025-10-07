public class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        // Calculate and display areas
        double squareArea = shape.calculateArea(5.0);
        System.out.printf("Area of square (side = 5): %.1f\n", squareArea);
        
        double rectangleArea = shape.calculateArea(5.0, 10.0);
        System.out.printf("Area of rectangle (5 x 10): %.1f\n", rectangleArea);
        
        double circleArea = shape.calculateAreaCircle(7.0);
        System.out.printf("Area of circle (radius = 7): %.3f\n", circleArea);
    }
}
