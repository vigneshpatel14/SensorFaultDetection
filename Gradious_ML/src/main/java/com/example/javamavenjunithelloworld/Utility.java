package com.example.javamavenjunithelloworld;

public class Utility {

    // Your name function
    public static void vignesh() {
        System.out.println("I am Vignesh");
    }

    // a. Check if number is odd or even
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    // b. Divisible by 2..9
    public static boolean isDivisibleBy2(int x) { return x % 2 == 0; }
    public static boolean isDivisibleBy3(int x) { return x % 3 == 0; }
    public static boolean isDivisibleBy4(int x) { return x % 4 == 0; }
    public static boolean isDivisibleBy5(int x) { return x % 5 == 0; }
    public static boolean isDivisibleBy6(int x) { return x % 6 == 0; }
    public static boolean isDivisibleBy7(int x) { return x % 7 == 0; }
    public static boolean isDivisibleBy8(int x) { return x % 8 == 0; }
    public static boolean isDivisibleBy9(int x) { return x % 9 == 0; }

    // c. Compare 2 numbers
    public static int biggerOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    // d. Biggest among 3
    public static int biggestOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // e. Print numbers 1 to 10
    public static void printOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // f. Leap year check
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // g. Add 2 numbers
    public static int add(int a, int b) { return a + b; }

    // h. Multiply 2 numbers
    public static int multiply(int a, int b) { return a * b; }

    // i. Divide 2 numbers
    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return (double) a / b;
    }

    // j. (a+b)^2
    public static int squareOfSum(int a, int b) {
        return (a + b) * (a + b);
    }

    // k. Area of circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // l. Area of square
    public static int areaOfSquare(int side) {
        return side * side;
    }

    // m. Area of rectangle
    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

    // n. Area of triangle
    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // o. Square root
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // --- quick test runner ---
    public static void main(String[] args) {
        vignesh();
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 9 divisible by 3? " + isDivisibleBy3(9));
        System.out.println("Bigger of (7, 12): " + biggerOfTwo(7, 12));
        System.out.println("Biggest of (3, 9, 5): " + biggestOfThree(3, 9, 5));
        printOneToTen();
        System.out.println("Year 2024 is leap year? " + isLeapYear(2024));
        System.out.println("Add(5,6): " + add(5,6));
        System.out.println("Multiply(3,4): " + multiply(3,4));
        System.out.println("Divide(10,2): " + divide(10,2));
        System.out.println("(3+4)^2: " + squareOfSum(3,4));
        System.out.println("Area of circle r=3: " + areaOfCircle(3));
        System.out.println("Area of square side=4: " + areaOfSquare(4));
        System.out.println("Area of rectangle 5x6: " + areaOfRectangle(5,6));
        System.out.println("Area of triangle b=6 h=4: " + areaOfTriangle(6,4));
        System.out.println("Square root of 25: " + squareRoot(25));
    }
}
