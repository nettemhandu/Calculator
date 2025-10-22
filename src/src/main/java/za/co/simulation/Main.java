package za.co.simulation;

public class Main {
    public static void main(String[] args) {
        // Call class and make an object of that class
        Calculator calculator = new Calculator();

        // Call methods and instantiate with data then print results
        int result = calculator.add(50, 50);
        System.out.println("The answer for addition is: " + result);

        int result1 = calculator.subtract(-3,-7);
        System.out.println("The answer for subtract is: " + result1);

        int result2 = calculator.divide(5,2);
        System.out.println("Answer for division is: " + result2);

        int result3 = calculator.multiply(5,2);
        System.out.println("Answer for multiplication is: " + result3);
    }
}