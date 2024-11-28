package com.example.circle;
import java.awt.*;

public class Circle {
    // constr
    Point center;
    double radius;
    // static var
    static int numberOfCircles;

    // constr
    Circle() {
        numberOfCircles++;
        center = new Point(0, 0);
        radius = 1;
    }

    // constr
    Circle(Point center, double radius) {
        numberOfCircles++;
        this.center = center;
        this.radius = radius;
    }

    // class new
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // class new
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    // class new
    void setCenter(Point center) {
        this.center = center;
    }
    // class new
    void setRadius(double radius) {
        this.radius = radius;
    }
    // static method
    static int getNumberOfCircles() {
        return numberOfCircles;
    }
}
