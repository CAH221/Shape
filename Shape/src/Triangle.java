//****************************************************//
//* Author:1717859                                    *//
//* Week:2                                            *//
//*                                                   *//
//* Description: Triangle class to represent a        *//
//*              triangle shape, including properties *//
//*              such as height and base, and methods *//
//*              for calculating the area and updating*//
//*              the attributes.                      *//
//*                                                   *//
//* Date: 06/10/2024                                  *//
//****************************************************//

// Triangle class to represent a triangle
class Triangle {
    private double height;  // Height of the triangle
    private double base;    // Base of the triangle

    // Constructor to initialize height and base
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    // Setter method to update the height of the triangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Setter method to update the base of the triangle
    public void setBase(double base) {
        this.base = base;
    }

    // Method to calculate and return the area of the triangle
    public double area() {
        return 0.5 * height * base;
    }

    // toString method to provide a string representation of the triangle
    public String toString() {
        return "Triangle with height: " + height + " and base: " + base + ", area: " + area();
    }
}
