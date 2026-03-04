/**
 * Test class for Calculator
 */
public class CalculatorTest {
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("=== Running Tests ===\n");
        
        // Test Addition
        System.out.println("Test 1: Addition");
        int addResult = calc.add(15, 10);
        System.out.println("15 + 10 = " + addResult);
        System.out.println(addResult == 25 ? "✓ PASSED" : "✗ FAILED");
        System.out.println();
        
        // Test Subtraction
        System.out.println("Test 2: Subtraction");
        int subResult = calc.subtract(20, 8);
        System.out.println("20 - 8 = " + subResult);
        System.out.println(subResult == 12 ? "✓ PASSED" : "✗ FAILED");
        System.out.println();
        
        // Test Multiplication
        System.out.println("Test 3: Multiplication");
        int mulResult = calc.multiply(7, 6);
        System.out.println("7 * 6 = " + mulResult);
        System.out.println(mulResult == 42 ? "✓ PASSED" : "✗ FAILED");
        System.out.println();
        
        // Test Division
        System.out.println("Test 4: Division");
        double divResult = calc.divide(100, 4);
        System.out.println("100 / 4 = " + divResult);
        System.out.println(divResult == 25.0 ? "✓ PASSED" : "✗ FAILED");
        System.out.println();
        
        // Test Division by Zero
        System.out.println("Test 5: Division by Zero");
        try {
            calc.divide(10, 0);
            System.out.println("✗ FAILED - Should throw exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✓ PASSED - Caught exception: " + e.getMessage());
        }
        
        System.out.println("\n=== All Tests Completed ===");
    }
}
