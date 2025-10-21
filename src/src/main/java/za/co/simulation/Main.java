package za.co.simulation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(50, 50);
        System.out.println("Answer for addition is: " + result);

        int result1 = calculator.subtract(-3,-7);
        System.out.println("Answer for subtract is: " + result1);

        int result2 = calculator.divide(5,2);
        System.out.println("Answer for division is: " + result2);

        int result3 = calculator.multiply(5,2);
        System.out.println("Answer for multiplication is: " + result3);
    }
}