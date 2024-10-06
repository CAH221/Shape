//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                            *//
//*                                                   *//
//* Description: Rectangle class to represent a       *//
//*              rectangle shape, including properties*//
//*              such as height and base, and methods *//
//*              for calculating the area and updating*//
//*              the attributes.                      *//
//*                                                   *//
//* Date: 06/10/2024                                  *//
//****************************************************//

// Rectangle class to represent a rectangle
public class Rectangle {
    private double height;  // Height of the rectangle
    private double base;    // Base (width) of the rectangle

    // Constructor to initialize height and base
    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // Setter method to update the height of the rectangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Setter method to update the base of the rectangle
    public void setBase(double base) {
        this.base = base;
    }

    // Method to calculate and return the area of the rectangle
    public double area() {
        return height * base;
    }

    // toString method to provide a string representation of the rectangle
    @Override
    public String toString() {
        return "Rectangle with height: " + height + " and base: " + base + ", area: " + area();
    }
}
