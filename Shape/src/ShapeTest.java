//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                            *//
//*                                                   *//
//* Description: Main test class to create and test   *//
//*              instances of different shapes,      *//
//*              including Triangle, Rectangle, and  *//
//*              Circle. Tests include using setters *//
//*              and displaying the shapes' details. *//
//*                                                   *//
//* Date: 06/10/2024                                  *//
//****************************************************//

// ShapeTest class to test the functionality of Triangle, Rectangle, and Circle classes
public class ShapeTest {
    public static void main(String[] args) {
        // Create Triangle object and test its methods
        Triangle triangle = new Triangle(5.0, 10.0);
        System.out.println(triangle.toString()); // Display triangle details using toString
        triangle.setHeight(6.0); // Update the height of the triangle
        System.out.println("Updated " + triangle.toString()); // Display updated triangle details

        // Create Rectangle object and test its methods
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println(rectangle.toString()); // Display rectangle details using toString
        rectangle.setBase(12.0); // Update the base (width) of the rectangle
        System.out.println("Updated " + rectangle.toString()); // Display updated rectangle details

        // Create Circle object and test its methods
        Circle circle = new Circle(7.0);
        System.out.println(circle.toString()); // Display circle details using toString
        circle.setRadius(10.0); // Update the radius of the circle
        System.out.println("Updated " + circle.toString()); // Display updated circle details
    }
}
