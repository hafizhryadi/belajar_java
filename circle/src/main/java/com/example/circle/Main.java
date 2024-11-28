package com.example.circle;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //static method
        System.out.println(Circle.getNumberOfCircles());

        // constr
        Circle c1 = new Circle(new Point(1, 2), 3);
        System.out.println(c1.center);
        System.out.println(c1.radius);
        // class new
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        // static var
        c1.numberOfCircles = 10;

        // constr
        Circle c2 = new Circle();
        System.out.println(c2.center);
        System.out.println(c2.radius);

        // // static var
        System.out.println(Circle.numberOfCircles);

        // visibility modifier
        Test test = new Test();
        test.setX(10);
        System.out.println("isi varibel private: " + test.getX());
        test.y = 12;
        System.out.println("isi variabel public: " + test.y);

        // overloading
        System.out.println("Method 1: " + Overload.sum(20, 10));
        System.out.println("Method overloading: " + Overload.sum(20, 10, 5));

        // method 1
        System.out.print("Enter your name and age: ");
        System.out.println(getName() + " " + getAge());

        // method 2
        printPrimeBetween(10, 30);
        System.out.println();

        // override
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new Child();
        obj2.show();
    }

    // method 1
    public static String getName() {
        return new Scanner(System.in).nextLine();
    }
    public static int getAge() {
        return new Scanner(System.in).nextInt();
    }

    // method 2
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false;
        return true;

    }
    public static void printPrimeBetween(int start, int end) {
        for (int i = start; i <= end; i++)
        if (isPrime(i))
        System.out.print(i + " ");
    }
}

