package za.co.simulation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        System.out.println("Answer is: " + result);

        int result1 = calculator.subtract(5,2);
        System.out.println("Answer is: " + result);

        int result1 = calculator.divide(5,2);
        System.out.println("Answer is: " + result);

        int result1 = calculator.multiply(5,2);
        System.out.println("Answer is: " + result);
    }
}