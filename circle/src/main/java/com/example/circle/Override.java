package com.example.circle;

public class Override {
    
}

class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void show() {
        String output = "child";
        System.out.println(output);
    }
}
