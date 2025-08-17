package com.example.javamavenjunithelloworld;

public class Utility {

    // Your name function
    public static void vignesh() {
        System.out.println("I am Vignesh");
    }

    // Example utility: Area of a circle
    public static double areaOfCircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    // Quick test runner
    public static void main(String[] args) {
        vignesh();
        System.out.println("Area of circle with r=3: " + areaOfCircle(3));
    }
}
