/**
 * Simple Calculator class with basic arithmetic operations
 * Author: Siya
 * Date: March 2024
 */
public class Calculator {
    
    // Addition method
    public int add(int a, int b) {
        return a + b;
    }
    
    // Subtraction method
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Multiplication method
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Division method
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) a / b;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Calculator Demo ===");
        System.out.println("Addition (10 + 5): " + calc.add(10, 5));
        System.out.println("Subtraction (10 - 5): " + calc.subtract(10, 5));
        System.out.println("Multiplication (10 * 5): " + calc.multiply(10, 5));
        System.out.println("Division (10 / 5): " + calc.divide(10, 5));
    }
}
