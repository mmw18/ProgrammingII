/**
 * Module 4 Critical Thinking
 * Megan M. Wright
 * Colorado State Univeristy Global
 * CSC372-1: Computer Programming II
 * Dr. Luis Gonzales
 * November 3, 2024
 */

// This is an abstract class which is representative of a a general shape with methods 
//      to calculate the area and perimeter of the shape
abstract class Shape {
    // This is the area calculation method that will be used by the subclasses
    public abstract double AreaCalculation();
    
    // This is the perimeter calculation method that will be used by the subclasses
    public abstract double PerimeterCalculation();
}

// This is the rectangle class, which is extending the shape class > has distinct length and width values
class Rectangle extends Shape {
    private double rectangleWidth;
    private double rectangleHeight;

    // This is the initialization of the length and width for the rectangle
    public Rectangle(double rectangleWidth, double rectangleHeight) {
        this.rectangleWidth = rectangleWidth;
        this.rectangleHeight = rectangleHeight;
    }

    // This will calculate the area of the rectangle
    @Override
    public double AreaCalculation() {
        return rectangleWidth * rectangleHeight;
    }

    // This will calculate the perimeter of the rectangle
    @Override
    public double PerimeterCalculation() {
        return 2 * (rectangleWidth + rectangleHeight);
    }

    // This will provide the rectangles area and perimeter values
    @Override
    public String toString() {
        return "Rectangle: Area = " + AreaCalculation() + ", Perimeter = " + PerimeterCalculation();
    }
}

// This is the circle class, which is extending the shape class > has a distinct radius value
class Circle extends Shape {
    private double circleRadius;

    // This is the initialization of radius for the circle
    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    // This will calculate the area of the circle
    @Override
    public double AreaCalculation() {
        return Math.PI * circleRadius * circleRadius;
    }

    // This will calculate the perimeter of the circle
    @Override
    public double PerimeterCalculation() {
        return 2 * Math.PI * circleRadius;
    }

    // This will provide the circles area and perimeter values
    @Override
    public String toString() {
        return "Circle: Area= " + AreaCalculation() + ", & Perimeter= " + PerimeterCalculation();
    }
}

// This is the triangle class which is extending the shape class > 3 distinct sides
class Triangle extends Shape {
    private double triangleSide1;
    private double triangleSide2;
    private double triangleSide3;

    // This is the initialization of all sides of the triangle
    public Triangle(double triangleSide1, double triangleSide2, double triangleSide3) {
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        this.triangleSide3 = triangleSide3;
    }

    // This will calculate the area of the triange
    @Override
    public double AreaCalculation() {
        double semiPerimeter = (triangleSide1 + triangleSide2 + triangleSide3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - triangleSide1) * 
                         (semiPerimeter - triangleSide2) * (semiPerimeter - triangleSide3));
    }

    // This will calculate the perimeter of the triange
    @Override
    public double PerimeterCalculation() {
        return triangleSide1 + triangleSide2 + triangleSide3;
    }

    // This will provide the triangles area and perimeter values
    @Override
    public String toString() {
        return "Triangle: Area= " + AreaCalculation() + ", & Perimeter= " + PerimeterCalculation();
    }
}

// This is the main overall class to show the use of each shape class
public class Option2AbstractClassShape {
    public static void main(String[] args) {
        Shape myRectangle = new Rectangle(9, 5);
        Shape myCircle = new Circle(4);
        Shape myTriangle = new Triangle(5.0, 4.0, 3.0);

        Shape[] shapesArray = { myRectangle, myCircle, myTriangle };

        for (Shape shapeInstance : shapesArray) {
            System.out.println(shapeInstance.toString());
        }
    }
}
