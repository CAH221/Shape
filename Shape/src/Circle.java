//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                            *//
//*                                                   *//
//* Description: Circle class to represent a circle   *//
//*              shape, including properties such as  *//
//*              radius, and methods for calculating  *//
//*              the area and updating the radius.    *//
//*                                                   *//
//* Date: 06/10/2024                                  *//
//****************************************************//

// Circle class to represent a circle
public class Circle {
    private double radius;  // Radius of the circle
    private static final double myPi = 3.14; // Static constant for Pi value

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method to update the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double area() {
        return myPi * radius * radius;  // Area formula: Pi * r^2
    }

    // toString method to provide a string representation of the circle
    @Override
    public String toString() {
        return "Circle with radius: " + radius + ", area: " + area();
    }
}
